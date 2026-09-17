package org.jcodec.common.logging;

/* loaded from: classes2.dex */
public class Message {
    private java.lang.String className;
    private java.lang.String fileName;
    private org.jcodec.common.logging.LogLevel level;
    private int lineNumber;
    private java.lang.String message;
    private java.lang.String methodName;

    public Message(org.jcodec.common.logging.LogLevel r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, int r5, java.lang.String r6) {
            r0 = this;
            r0.<init>()
            r0.level = r1
            r0.fileName = r2
            r0.className = r3
            r0.methodName = r4
            r0.lineNumber = r5
            r0.message = r6
            return
    }

    public java.lang.String getClassName() {
            r1 = this;
            java.lang.String r0 = r1.className
            return r0
    }

    public java.lang.String getFileName() {
            r1 = this;
            java.lang.String r0 = r1.fileName
            return r0
    }

    public org.jcodec.common.logging.LogLevel getLevel() {
            r1 = this;
            org.jcodec.common.logging.LogLevel r0 = r1.level
            return r0
    }

    public int getLineNumber() {
            r1 = this;
            int r0 = r1.lineNumber
            return r0
    }

    public java.lang.String getMessage() {
            r1 = this;
            java.lang.String r0 = r1.message
            return r0
    }

    public java.lang.String getMethodName() {
            r1 = this;
            java.lang.String r0 = r1.methodName
            return r0
    }
}
