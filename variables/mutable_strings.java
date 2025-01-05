class MutableStrings {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("dhairya");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append(" hans");
        System.out.println(sb);
        System.out.println(sb.capacity());
        
        sb.deleteCharAt(4);
        System.out.println(sb);
        System.out.println(sb.capacity());

        sb.setLength(30);
        System.out.println(sb);
        System.out.println(sb.capacity());
    
    }
}
