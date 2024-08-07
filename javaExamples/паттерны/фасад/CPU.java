class CPU {
    public void freeze() {
        System.out.println("freeze");
    }

    public void jump(long position) {
        System.out.println("jump position = " + position);
    }

    public void execute() {
        System.out.println("execute");
    }
}
