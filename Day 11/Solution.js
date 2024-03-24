/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val === undefined ? 0 : val)
 *     this.next = (next === undefined ? null : next)
 * }
 */

/**
 * @param {ListNode} head
 * @return {void} Do not return anything, modify head in-place instead.
 */
var reorderList = function(head) {
    if (!head || !head.next) {
        return;
    }

    // Mid value of listt
    let slow = head;
    let fast = head;
    while (fast.next && fast.next.next) {
        slow = slow.next;
        fast = fast.next.next;
    }

    // Splitting list into two halves..
    let second_half = slow.next;
    slow.next = null;

    // Reversed second half.
    let prev = null;
    let current = second_half;
    while (current) {
        let next_node = current.next;
        current.next = prev;
        prev = current;
        current = next_node;
    }
    second_half = prev;

    // Finally merging them together
    let first_half = head;
    while (second_half) {
        let temp1 = first_half.next;
        first_half.next = second_half;
        let temp2 = second_half.next;
        second_half.next = temp1;
        first_half = temp1;
        second_half = temp2;
    }
};
