void main() {
        int primitiveInt = 5;
        Integer boxedInt = primitiveInt;
        System.out.println("int " + primitiveInt + ", box " + boxedInt);

        boolean primitiveBool = true;
        Boolean boxedBool = primitiveBool;
        System.out.println("bool " + primitiveBool + ", box " + boxedBool);

        long primitiveLong = 100L;
        Long boxedLong = primitiveLong;
        System.out.println("long " + primitiveLong + ", box " + boxedLong);

        Integer nullInteger = null;
        try {
            int result = nullInteger;
        } catch (NullPointerException e) {
            System.out.println("Ошибка: " + e);
    }
}