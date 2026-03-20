static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
    // 1.Nodo 'dummy' para empezar
    SinglyLinkedListNode dummy = new SinglyLinkedListNode(0);
    // 2. Un puntero 'current' que irá avanzando
    SinglyLinkedListNode current = dummy;

    // 3. Mientras ambas listas tengan nodos
    while (head1 != null && head2 != null) {
        if (head1.data <= head2.data) {
            current.next = head1;
            head1 = head1.next;
        } else {
            current.next = head2;
            head2 = head2.next;
        }
        current = current.next;
    }

    // 4. Si una lista se acabó antes que la otra, pegamos el resto
    if (head1 != null) {
        current.next = head1;
    } else {
        current.next = head2;
    }

    // El resultado real empieza después del dummy
    return dummy.next;
}
