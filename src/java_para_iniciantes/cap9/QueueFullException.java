package java_para_iniciantes.cap9;

public class QueueFullException extends Exception {
    int size;
    QueueFullException(int s) { size = s; }
    public String toString() {
        return "\nQueue is full. Maximum size is " + size;
    }
}
