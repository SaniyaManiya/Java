class QueueArray {
    int front = 0, rear = -1;
    int[] q = new int[5];

    void enqueue(int x) {
        q[++rear] = x;
    }

    int dequeue() {
        return q[front++];
    }

    public static void main(String[] args) {
        QueueArray obj = new QueueArray();
        obj.enqueue(10);
        obj.enqueue(20);
        System.out.println(obj.dequeue());
    }
}
