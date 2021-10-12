package tasks.classwork.day2;

public class Glass {

    private int fullVolume;
    private int price;
    protected int effectiveVoulume;
    private String color;
    private boolean isEmpty = true;

    public Glass(int fullVolume, String color) {
        this.fullVolume = fullVolume;
        this.color = color;
    }

        public int getFullVolume () {
            return fullVolume;
        }

        public int getEffectiveVoulume () {
            return effectiveVoulume;
        }

        public void setEffectiveVoulume ( int effectiveVoulume){
            this.effectiveVoulume = effectiveVoulume;

            if (effectiveVoulume > 0) {
                this.isEmpty = false;
            }
        }
        public String getColor () {
            return color;
        }
        public boolean isEmpty () {
            return isEmpty;
        }
    }
