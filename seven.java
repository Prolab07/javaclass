
public class seven {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Lena");
        recursionStars(name);
        System.out.println(name);

    }

    public static StringBuilder recursionStars(StringBuilder name) {
        if (name.length() < 15) {
            recursionStars(name.append("*"));
        }
        return name;
    }
}


/*
public class seven {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Ohh!");
        recursionplus(name);
        System.out.println(name);

    }

    public static StringBuilder recursionplus(StringBuilder name) {
        if (name.length() < 22) {
            recursionplus(name.append("!!...Ohh!"));
        }
        return name;
    }
}
*/

/*
public class seven {
    public static void main(String[] args) {
        int i = 34;
        i = kub(i);
        System.out.println(i);

    }

    static int kub(int x) {
        return x * x * x;
    }
}

/*
public class sixth {
    private int dodavannay(int x, int y) {
        return (x+y);
    }
}
public class sixth {
    private int vidnimannay(int x, int y) {
        return (x - y);
    }
}

public class sixth {
    private int mnohennay(int x, int y) {
        return (x * y);
    }
}

public class sixth {
    private int dilennay(int x, int y) {
        return (x / y);
    }
}
*/




