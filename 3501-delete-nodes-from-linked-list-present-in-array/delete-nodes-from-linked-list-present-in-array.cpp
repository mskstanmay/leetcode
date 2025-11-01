class Solution {
public:
    ListNode* modifiedList(vector<int>& nums, ListNode* head) {
        bitset<100001> remove;
        for (int v : nums)
            remove.set(v);

        ListNode dummy(0, head);
        ListNode* prev = &dummy;

        while (prev->next != nullptr) {
            if (remove.test(prev->next->val))
                prev->next = prev->next->next;
            else
                prev = prev->next;
        }

        return dummy.next;
    }
};