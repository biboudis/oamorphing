
// Question: Is this equivalent with a A&B type?
abstract class Intersection <interface A, interface B> {
    
    <R extends Object, A*>[m] for(R m (A): A.methods ; some R m (A): B.methods )
    abstract R m (A a);
}