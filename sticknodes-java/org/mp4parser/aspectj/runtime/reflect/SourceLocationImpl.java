package org.mp4parser.aspectj.runtime.reflect;

/* loaded from: classes2.dex */
class SourceLocationImpl implements org.mp4parser.aspectj.lang.reflect.SourceLocation {
    java.lang.String fileName;
    int line;
    java.lang.Class withinType;

    SourceLocationImpl(java.lang.Class r1, java.lang.String r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.withinType = r1
            r0.fileName = r2
            r0.line = r3
            return
    }

    public java.lang.String getFileName() {
            r1 = this;
            java.lang.String r0 = r1.fileName
            return r0
    }

    public int getLine() {
            r1 = this;
            int r0 = r1.line
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = r2.getFileName()
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            int r1 = r2.getLine()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
