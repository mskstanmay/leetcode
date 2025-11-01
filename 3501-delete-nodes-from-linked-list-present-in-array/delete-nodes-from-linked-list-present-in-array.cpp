/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */

class Solution {
public:
    ListNode* modifiedList(vector<int>& nums, ListNode* head) {
        
        unordered_set<int> unWanted; unWanted.reserve(nums.size()); //FFixing size to save memory
        for (int v : nums) {
            unWanted.insert(v);
        }

        ListNode dummy(0, head);
        ListNode* prev = &dummy;

        while (prev->next != nullptr) {
            if (unWanted.count(prev->next->val)) {
                prev->next = prev->next->next;
            } else {
                prev = prev->next;
            }
        }

       return dummy.next;
    }
};

