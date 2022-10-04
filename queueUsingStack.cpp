#include <iostream>
#include <stack>
using namespace std;

struct Queue{
    stack<int> s1, s2;

    //enQueue an item to the queue
    void enQueue(int x)
    {
        //push an item into the first stack
        s1.push(x);
    }

    //deQueue an item from the queue
    int deQueue()
    {
        //if both stacks are empty
        if(s1.empty() && s2.empty())
        {
            cout<<"Queue Underflow"<<endl;
            exit(0);
        }

        //if s2 is empty, move elements from s1
        if(s2.empty())
        {
            while(!s1.empty())
            {
                s2.push(s1.top());
                s1.pop();
            }
        }

        //return the top item from s2
        int x = s2.top();
        s2.pop();
        return x; 
    }

    int front()
    {
        stack<int> st1=s1, st2;
        while(!st1.empty())
            {
                st2.push(st1.top());
                st1.pop();
            }

        //return the top item from s2
        int x = st2.top();
        return x; 
    }

    int rear()
    {
        int x = s1.top();
        return x;
    }
};

int main()
{
    Queue queue;
    queue.enQueue(1);
    queue.enQueue(2);
    queue.enQueue(3);

    cout<<queue.front()<<endl;
    cout<<queue.rear()<<endl;

    cout << queue.deQueue() << endl;
    cout << queue.deQueue() << endl;
    cout << queue.deQueue() << endl;
    return 0;
}
