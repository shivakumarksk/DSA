package java8;

public  class CmprblCmprtr implements Comparable<CmprblCmprtr> {

    // Using Comparable

        private String name;
        private int age;

        public CmprblCmprtr(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int compareTo(CmprblCmprtr other) {
            return Integer.compare(this.age, other.age);
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

    }
