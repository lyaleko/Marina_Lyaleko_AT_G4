package tasks.homework.stringtask;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

//  имеется текст лога в виде:
//access_log.2020.09.07 212.168.101.5 granted
//access_log.2020.09.07 212.168.101.6 denied
//написать метод, который выводит список из уникальных IP адресов и количества удачных и неудачных попыток доступа в формате:
//ip 212.168.101.5: ok - 3, failed - 2

public class UserAttempt {
    private String ip;
    private int success;
    private int failed;

    public static void main(String[] args) {

        List<String> log = new ArrayList<>();

        log.add("access_log.2020.09.07 212.168.101.5 granted");
        log.add("access_log.2020.09.07 212.168.101.5 denied");
        log.add("access_log.2020.09.07 212.168.101.6 denied");
        log.add("access_log.2020.09.07 212.168.101.6 granted");
        log.add("access_log.2020.09.07 212.168.101.6 granted");

        Pattern p = Pattern.compile("(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)");// ("([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])");

        log.stream()
                .map(logRow -> {
                    Matcher m = p.matcher(logRow);
                    UserAttempt userAttempt = new UserAttempt();
                    while (m.find()) {
                        userAttempt.setIp(m.group());
                        if (logRow.contains("granted")) {
                            userAttempt.setSuccess(1);
                        } else if (logRow.contains("denied")) {
                            userAttempt.setFailed(1);
                        }
                    }
                    return userAttempt;
                })
                .collect(Collectors.toMap(UserAttempt::getIp, Function.identity(), (oldUser, newUser) -> {
                    oldUser.setSuccess(oldUser.getSuccess() + 1);
                    oldUser.setFailed(oldUser.getFailed() + 1);
                    return oldUser;
                }))
                .values()
                .forEach(System.out::println);
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public int getFailed() {
        return failed;
    }

    public void setFailed(int failed) {
        this.failed = failed;
    }

    @Override
    public String toString() {
        return String.format("ip %s : ok - %d, failed - %d;", ip, success, failed);
    }
}