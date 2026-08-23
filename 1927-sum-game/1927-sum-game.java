
class Solution {
    public boolean sumGame(String num) {

        int first_sum = 0;
        int second_sum = 0;

        int first_question_count = 0;
        int second_question_count = 0;

        for (int i = 0; i < num.length(); i++) {

            char ch = num.charAt(i);

            if (i < num.length() / 2) {

                if (ch == '?') {
                    first_question_count++;
                } else {
                    first_sum += ch - '0';
                }

            } else {

                if (ch == '?') {
                    second_question_count++;
                } else {
                    second_sum += ch - '0';
                }
            }
        }

        int diff = first_sum - second_sum;

        int question_diff =
                first_question_count - second_question_count;

        return 2 * diff + 9 * question_diff != 0;
    }
}
