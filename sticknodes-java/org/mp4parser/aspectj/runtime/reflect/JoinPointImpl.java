package org.mp4parser.aspectj.runtime.reflect;

/* loaded from: classes2.dex */
class JoinPointImpl implements org.mp4parser.aspectj.lang.JoinPoint {
    java.lang.Object _this;
    java.lang.Object[] args;
    org.mp4parser.aspectj.lang.JoinPoint.StaticPart staticPart;
    java.lang.Object target;

    static class StaticPartImpl implements org.mp4parser.aspectj.lang.JoinPoint.StaticPart {
        private int id;
        java.lang.String kind;
        org.mp4parser.aspectj.lang.Signature signature;
        org.mp4parser.aspectj.lang.reflect.SourceLocation sourceLocation;

        public StaticPartImpl(int r1, java.lang.String r2, org.mp4parser.aspectj.lang.Signature r3, org.mp4parser.aspectj.lang.reflect.SourceLocation r4) {
                r0 = this;
                r0.<init>()
                r0.kind = r2
                r0.signature = r3
                r0.sourceLocation = r4
                r0.id = r1
                return
        }

        public java.lang.String getKind() {
                r1 = this;
                java.lang.String r0 = r1.kind
                return r0
        }

        public org.mp4parser.aspectj.lang.Signature getSignature() {
                r1 = this;
                org.mp4parser.aspectj.lang.Signature r0 = r1.signature
                return r0
        }

        @Override // org.mp4parser.aspectj.lang.JoinPoint.StaticPart
        public final java.lang.String toString() {
                r1 = this;
                org.mp4parser.aspectj.runtime.reflect.StringMaker r0 = org.mp4parser.aspectj.runtime.reflect.StringMaker.middleStringMaker
                java.lang.String r0 = r1.toString(r0)
                return r0
        }

        java.lang.String toString(org.mp4parser.aspectj.runtime.reflect.StringMaker r3) {
                r2 = this;
                java.lang.StringBuffer r0 = new java.lang.StringBuffer
                r0.<init>()
                java.lang.String r1 = r2.getKind()
                java.lang.String r1 = r3.makeKindName(r1)
                r0.append(r1)
                java.lang.String r1 = "("
                r0.append(r1)
                org.mp4parser.aspectj.lang.Signature r1 = r2.getSignature()
                org.mp4parser.aspectj.runtime.reflect.SignatureImpl r1 = (org.mp4parser.aspectj.runtime.reflect.SignatureImpl) r1
                java.lang.String r3 = r1.toString(r3)
                r0.append(r3)
                java.lang.String r3 = ")"
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                return r3
        }
    }

    public JoinPointImpl(org.mp4parser.aspectj.lang.JoinPoint.StaticPart r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object[] r4) {
            r0 = this;
            r0.<init>()
            r0.staticPart = r1
            r0._this = r2
            r0.target = r3
            r0.args = r4
            return
    }

    @Override // org.mp4parser.aspectj.lang.JoinPoint
    public java.lang.Object getTarget() {
            r1 = this;
            java.lang.Object r0 = r1.target
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r1.staticPart
            java.lang.String r0 = r0.toString()
            return r0
    }
}
