class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();

        for (char ch : address.toCharArray()) {
            if (ch == '.') {
                sb.append('[').append(ch).append(']');
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}