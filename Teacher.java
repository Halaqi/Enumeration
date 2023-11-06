enum Branch {
    MATH("y'=dx/dy"),
    PHYSICS("E=mc^2"),
    CS("Hello World"),
    ENG("My name is Jorge ");

    String info;

    Branch(String info) {
        this.info = info;
    }
}

   public class Teacher {
        int id;
        Branch branch;

        public Teacher(int id, Branch branch) {
            this.id = id;
            this.branch = branch;
        }

        public int getId() {
            return id;
        }

        public Branch getBranch() {
            return branch;
        }
    }


