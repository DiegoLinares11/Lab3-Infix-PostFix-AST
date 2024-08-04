abstract class ASTNode {
    abstract void accept(ASTVisitor visitor);
}

class OperandNode extends ASTNode {
    char value;

    OperandNode(char value) {
        this.value = value;
    }

    void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}

class OperatorNode extends ASTNode {
    char operator;
    ASTNode left, right;

    OperatorNode(char operator, ASTNode left, ASTNode right) {
        this.operator = operator;
        this.left = left;
        this.right = right;
    }

    void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}

class UnaryOperatorNode extends ASTNode {
    char operator;
    ASTNode operand;

    UnaryOperatorNode(char operator, ASTNode operand) {
        this.operator = operator;
        this.operand = operand;
    }

    void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
