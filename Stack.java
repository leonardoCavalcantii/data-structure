class Stack{

 private T[] array;
 private int top;

public T top(){
    this.top = -1;
}
    
public boolean isEmpity(){
    if(top == -1){
        return true;
    }else {
        return false;
    }
}

public boolean isFull(){
    if(top == array.length -1){
        return true;
    } else{
        return false;
    }
}

public pvoid push(T index){    
    if(isFull()){
        throw new StackOverFlowException();
    } else{
        index ++; this.array[top] = index;
    }
}

public T pop(){
    if(isEmpity()){
        throw new StackUnderFlowExcepition();
    } else{
        T elemnt = this.array[top];
        top--;
        return element;
    }
  }
}
