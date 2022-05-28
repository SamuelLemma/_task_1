package com.company;

class Main {
    public static void main(String[] args) {
        try {
            NullPointer.Error();
        } catch (NullPointerException e) {
            e.getMessage();
        }
    }
}
class NullPointer {
            public static void Error() {
                int number = (Integer) null;
            }
        }
        