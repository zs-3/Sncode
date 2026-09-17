package com.googlecode.mp4parser.boxes.microsoft;

/* loaded from: classes2.dex */
public class XtraBox extends com.googlecode.mp4parser.AbstractBox {
    private static final long FILETIME_EPOCH_DIFF = 11644473600000L;
    private static final long FILETIME_ONE_MILLISECOND = 10000;
    public static final int MP4_XTRA_BT_FILETIME = 21;
    public static final int MP4_XTRA_BT_GUID = 72;
    public static final int MP4_XTRA_BT_INT64 = 19;
    public static final int MP4_XTRA_BT_UNICODE = 8;
    public static final java.lang.String TYPE = "Xtra";
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_10 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_6 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_7 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_8 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_9 = null;
    java.nio.ByteBuffer data;
    private boolean successfulParse;
    java.util.Vector<com.googlecode.mp4parser.boxes.microsoft.XtraBox.XtraTag> tags;

    /* renamed from: com.googlecode.mp4parser.boxes.microsoft.XtraBox$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static class XtraTag {
        private int inputSize;
        private java.lang.String tagName;
        private java.util.Vector<com.googlecode.mp4parser.boxes.microsoft.XtraBox.XtraValue> values;

        private XtraTag() {
                r1 = this;
                r1.<init>()
                java.util.Vector r0 = new java.util.Vector
                r0.<init>()
                r1.values = r0
                return
        }

        /* synthetic */ XtraTag(com.googlecode.mp4parser.boxes.microsoft.XtraBox.XtraTag r1) {
                r0 = this;
                r0.<init>()
                return
        }

        private XtraTag(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.tagName = r1
                return
        }

        /* synthetic */ XtraTag(java.lang.String r1, com.googlecode.mp4parser.boxes.microsoft.XtraBox.XtraTag r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        static /* synthetic */ int access$0(com.googlecode.mp4parser.boxes.microsoft.XtraBox.XtraTag r0) {
                int r0 = r0.getContentSize()
                return r0
        }

        static /* synthetic */ java.util.Vector access$1(com.googlecode.mp4parser.boxes.microsoft.XtraBox.XtraTag r0) {
                java.util.Vector<com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraValue> r0 = r0.values
                return r0
        }

        static /* synthetic */ java.lang.String access$2(com.googlecode.mp4parser.boxes.microsoft.XtraBox.XtraTag r0) {
                java.lang.String r0 = r0.tagName
                return r0
        }

        static /* synthetic */ void access$4(com.googlecode.mp4parser.boxes.microsoft.XtraBox.XtraTag r0, java.nio.ByteBuffer r1) {
                r0.parse(r1)
                return
        }

        static /* synthetic */ void access$5(com.googlecode.mp4parser.boxes.microsoft.XtraBox.XtraTag r0, java.nio.ByteBuffer r1) {
                r0.getContent(r1)
                return
        }

        private void getContent(java.nio.ByteBuffer r3) {
                r2 = this;
                int r0 = r2.getContentSize()
                r3.putInt(r0)
                java.lang.String r0 = r2.tagName
                int r0 = r0.length()
                r3.putInt(r0)
                java.lang.String r0 = r2.tagName
                com.googlecode.mp4parser.boxes.microsoft.XtraBox.access$1(r3, r0)
                java.util.Vector<com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraValue> r0 = r2.values
                int r0 = r0.size()
                r3.putInt(r0)
                r0 = 0
            L1f:
                java.util.Vector<com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraValue> r1 = r2.values
                int r1 = r1.size()
                if (r0 < r1) goto L28
                return
            L28:
                java.util.Vector<com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraValue> r1 = r2.values
                java.lang.Object r1 = r1.elementAt(r0)
                com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraValue r1 = (com.googlecode.mp4parser.boxes.microsoft.XtraBox.XtraValue) r1
                com.googlecode.mp4parser.boxes.microsoft.XtraBox.XtraValue.access$2(r1, r3)
                int r0 = r0 + 1
                goto L1f
        }

        private int getContentSize() {
                r3 = this;
                java.lang.String r0 = r3.tagName
                int r0 = r0.length()
                int r0 = r0 + 12
                r1 = 0
            L9:
                java.util.Vector<com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraValue> r2 = r3.values
                int r2 = r2.size()
                if (r1 < r2) goto L12
                return r0
            L12:
                java.util.Vector<com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraValue> r2 = r3.values
                java.lang.Object r2 = r2.elementAt(r1)
                com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraValue r2 = (com.googlecode.mp4parser.boxes.microsoft.XtraBox.XtraValue) r2
                int r2 = com.googlecode.mp4parser.boxes.microsoft.XtraBox.XtraValue.access$3(r2)
                int r0 = r0 + r2
                int r1 = r1 + 1
                goto L9
        }

        private void parse(java.nio.ByteBuffer r5) {
                r4 = this;
                int r0 = r5.getInt()
                r4.inputSize = r0
                int r0 = r5.getInt()
                java.lang.String r0 = com.googlecode.mp4parser.boxes.microsoft.XtraBox.access$0(r5, r0)
                r4.tagName = r0
                int r0 = r5.getInt()
                r1 = 0
            L15:
                if (r1 < r0) goto L4c
                int r5 = r4.inputSize
                int r0 = r4.getContentSize()
                if (r5 != r0) goto L20
                return
            L20:
                java.lang.RuntimeException r5 = new java.lang.RuntimeException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Improperly handled Xtra tag: Sizes don't match ( "
                r0.<init>(r1)
                int r1 = r4.inputSize
                r0.append(r1)
                java.lang.String r1 = "/"
                r0.append(r1)
                int r1 = r4.getContentSize()
                r0.append(r1)
                java.lang.String r1 = ") on "
                r0.append(r1)
                java.lang.String r1 = r4.tagName
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r5.<init>(r0)
                throw r5
            L4c:
                com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraValue r2 = new com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraValue
                r3 = 0
                r2.<init>(r3)
                com.googlecode.mp4parser.boxes.microsoft.XtraBox.XtraValue.access$1(r2, r5)
                java.util.Vector<com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraValue> r3 = r4.values
                r3.addElement(r2)
                int r1 = r1 + 1
                goto L15
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuffer r0 = new java.lang.StringBuffer
                r0.<init>()
                java.lang.String r1 = r3.tagName
                r0.append(r1)
                java.lang.String r1 = " ["
                r0.append(r1)
                int r1 = r3.inputSize
                r0.append(r1)
                java.lang.String r1 = "/"
                r0.append(r1)
                java.util.Vector<com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraValue> r1 = r3.values
                int r1 = r1.size()
                r0.append(r1)
                java.lang.String r1 = "]:\n"
                r0.append(r1)
                r1 = 0
            L28:
                java.util.Vector<com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraValue> r2 = r3.values
                int r2 = r2.size()
                if (r1 < r2) goto L35
                java.lang.String r0 = r0.toString()
                return r0
            L35:
                java.lang.String r2 = "  "
                r0.append(r2)
                java.util.Vector<com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraValue> r2 = r3.values
                java.lang.Object r2 = r2.elementAt(r1)
                com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraValue r2 = (com.googlecode.mp4parser.boxes.microsoft.XtraBox.XtraValue) r2
                java.lang.String r2 = r2.toString()
                r0.append(r2)
                java.lang.String r2 = "\n"
                r0.append(r2)
                int r1 = r1 + 1
                goto L28
        }
    }

    private static class XtraValue {
        public java.util.Date fileTimeValue;
        public long longValue;
        public byte[] nonParsedValue;
        public java.lang.String stringValue;
        public int type;

        private XtraValue() {
                r0 = this;
                r0.<init>()
                return
        }

        private XtraValue(long r2) {
                r1 = this;
                r1.<init>()
                r0 = 19
                r1.type = r0
                r1.longValue = r2
                return
        }

        /* synthetic */ XtraValue(long r1, com.googlecode.mp4parser.boxes.microsoft.XtraBox.XtraValue r3) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        /* synthetic */ XtraValue(com.googlecode.mp4parser.boxes.microsoft.XtraBox.XtraValue r1) {
                r0 = this;
                r0.<init>()
                return
        }

        private XtraValue(java.lang.String r2) {
                r1 = this;
                r1.<init>()
                r0 = 8
                r1.type = r0
                r1.stringValue = r2
                return
        }

        /* synthetic */ XtraValue(java.lang.String r1, com.googlecode.mp4parser.boxes.microsoft.XtraBox.XtraValue r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private XtraValue(java.util.Date r2) {
                r1 = this;
                r1.<init>()
                r0 = 21
                r1.type = r0
                r1.fileTimeValue = r2
                return
        }

        /* synthetic */ XtraValue(java.util.Date r1, com.googlecode.mp4parser.boxes.microsoft.XtraBox.XtraValue r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        static /* synthetic */ void access$1(com.googlecode.mp4parser.boxes.microsoft.XtraBox.XtraValue r0, java.nio.ByteBuffer r1) {
                r0.parse(r1)
                return
        }

        static /* synthetic */ void access$2(com.googlecode.mp4parser.boxes.microsoft.XtraBox.XtraValue r0, java.nio.ByteBuffer r1) {
                r0.getContent(r1)
                return
        }

        static /* synthetic */ int access$3(com.googlecode.mp4parser.boxes.microsoft.XtraBox.XtraValue r0) {
                int r0 = r0.getContentSize()
                return r0
        }

        static /* synthetic */ java.lang.Object access$4(com.googlecode.mp4parser.boxes.microsoft.XtraBox.XtraValue r0) {
                java.lang.Object r0 = r0.getValueAsObject()
                return r0
        }

        private void getContent(java.nio.ByteBuffer r3) {
                r2 = this;
                int r0 = r2.getContentSize()     // Catch: java.lang.Throwable -> L45
                r3.putInt(r0)     // Catch: java.lang.Throwable -> L45
                int r0 = r2.type     // Catch: java.lang.Throwable -> L45
                short r0 = (short) r0     // Catch: java.lang.Throwable -> L45
                r3.putShort(r0)     // Catch: java.lang.Throwable -> L45
                java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L45
                r3.order(r0)     // Catch: java.lang.Throwable -> L45
                int r0 = r2.type     // Catch: java.lang.Throwable -> L45
                r1 = 8
                if (r0 == r1) goto L3a
                r1 = 19
                if (r0 == r1) goto L34
                r1 = 21
                if (r0 == r1) goto L26
                byte[] r0 = r2.nonParsedValue     // Catch: java.lang.Throwable -> L45
                r3.put(r0)     // Catch: java.lang.Throwable -> L45
                goto L3f
            L26:
                java.util.Date r0 = r2.fileTimeValue     // Catch: java.lang.Throwable -> L45
                long r0 = r0.getTime()     // Catch: java.lang.Throwable -> L45
                long r0 = com.googlecode.mp4parser.boxes.microsoft.XtraBox.access$5(r0)     // Catch: java.lang.Throwable -> L45
                r3.putLong(r0)     // Catch: java.lang.Throwable -> L45
                goto L3f
            L34:
                long r0 = r2.longValue     // Catch: java.lang.Throwable -> L45
                r3.putLong(r0)     // Catch: java.lang.Throwable -> L45
                goto L3f
            L3a:
                java.lang.String r0 = r2.stringValue     // Catch: java.lang.Throwable -> L45
                com.googlecode.mp4parser.boxes.microsoft.XtraBox.access$4(r3, r0)     // Catch: java.lang.Throwable -> L45
            L3f:
                java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
                r3.order(r0)
                return
            L45:
                r0 = move-exception
                java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
                r3.order(r1)
                throw r0
        }

        private int getContentSize() {
                r2 = this;
                int r0 = r2.type
                r1 = 8
                if (r0 == r1) goto L15
                r1 = 19
                if (r0 == r1) goto L12
                r1 = 21
                if (r0 == r1) goto L12
                byte[] r0 = r2.nonParsedValue
                int r0 = r0.length
                goto L1f
            L12:
                r0 = 14
                goto L21
            L15:
                java.lang.String r0 = r2.stringValue
                int r0 = r0.length()
                int r0 = r0 * 2
                int r0 = r0 + 2
            L1f:
                int r0 = r0 + 6
            L21:
                return r0
        }

        private java.lang.Object getValueAsObject() {
                r3 = this;
                int r0 = r3.type
                r1 = 8
                if (r0 == r1) goto L1c
                r1 = 19
                if (r0 == r1) goto L14
                r1 = 21
                if (r0 == r1) goto L11
                byte[] r0 = r3.nonParsedValue
                return r0
            L11:
                java.util.Date r0 = r3.fileTimeValue
                return r0
            L14:
                java.lang.Long r0 = new java.lang.Long
                long r1 = r3.longValue
                r0.<init>(r1)
                return r0
            L1c:
                java.lang.String r0 = r3.stringValue
                return r0
        }

        private void parse(java.nio.ByteBuffer r4) {
                r3 = this;
                int r0 = r4.getInt()
                int r0 = r0 + (-6)
                short r1 = r4.getShort()
                r3.type = r1
                java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
                r4.order(r1)
                int r1 = r3.type
                r2 = 8
                if (r1 == r2) goto L3e
                r2 = 19
                if (r1 == r2) goto L37
                r2 = 21
                if (r1 == r2) goto L27
                byte[] r0 = new byte[r0]
                r3.nonParsedValue = r0
                r4.get(r0)
                goto L44
            L27:
                java.util.Date r0 = new java.util.Date
                long r1 = r4.getLong()
                long r1 = com.googlecode.mp4parser.boxes.microsoft.XtraBox.access$3(r1)
                r0.<init>(r1)
                r3.fileTimeValue = r0
                goto L44
            L37:
                long r0 = r4.getLong()
                r3.longValue = r0
                goto L44
            L3e:
                java.lang.String r0 = com.googlecode.mp4parser.boxes.microsoft.XtraBox.access$2(r4, r0)
                r3.stringValue = r0
            L44:
                java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
                r4.order(r0)
                return
        }

        public java.lang.String toString() {
                r3 = this;
                int r0 = r3.type
                r1 = 8
                if (r0 == r1) goto L3b
                r1 = 19
                if (r0 == r1) goto L26
                r1 = 21
                if (r0 == r1) goto L11
                java.lang.String r0 = "[GUID](nonParsed)"
                return r0
            L11:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "[filetime]"
                r0.<init>(r1)
                java.util.Date r1 = r3.fileTimeValue
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
            L26:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "[long]"
                r0.<init>(r1)
                long r1 = r3.longValue
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
            L3b:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "[string]"
                r0.<init>(r1)
                java.lang.String r1 = r3.stringValue
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            ajc$preClinit()
            return
    }

    public XtraBox() {
            r1 = this;
            java.lang.String r0 = "Xtra"
            r1.<init>(r0)
            r0 = 0
            r1.successfulParse = r0
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            r1.tags = r0
            return
    }

    public XtraBox(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.successfulParse = r1
            java.util.Vector r1 = new java.util.Vector
            r1.<init>()
            r0.tags = r1
            return
    }

    static /* synthetic */ java.lang.String access$0(java.nio.ByteBuffer r0, int r1) {
            java.lang.String r0 = readAsciiString(r0, r1)
            return r0
    }

    static /* synthetic */ void access$1(java.nio.ByteBuffer r0, java.lang.String r1) {
            writeAsciiString(r0, r1)
            return
    }

    static /* synthetic */ java.lang.String access$2(java.nio.ByteBuffer r0, int r1) {
            java.lang.String r0 = readUtf16String(r0, r1)
            return r0
    }

    static /* synthetic */ long access$3(long r0) {
            long r0 = filetimeToMillis(r0)
            return r0
    }

    static /* synthetic */ void access$4(java.nio.ByteBuffer r0, java.lang.String r1) {
            writeUtf16String(r0, r1)
            return
    }

    static /* synthetic */ long access$5(long r0) {
            long r0 = millisToFiletime(r0)
            return r0
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.googlecode.mp4parser.boxes.microsoft.XtraBox> r0 = com.googlecode.mp4parser.boxes.microsoft.XtraBox.class
            java.lang.String r1 = "XtraBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "toString"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.microsoft.XtraBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 88
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.microsoft.XtraBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getAllTagNames"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.microsoft.XtraBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "[Ljava.lang.String;"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 151(0x97, float:2.12E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.microsoft.XtraBox.ajc$tjp_1 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setTagValue"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.microsoft.XtraBox"
            java.lang.String r4 = "java.lang.String:long"
            java.lang.String r5 = "name:value"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 289(0x121, float:4.05E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.microsoft.XtraBox.ajc$tjp_10 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getFirstStringValue"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.microsoft.XtraBox"
            java.lang.String r4 = "java.lang.String"
            java.lang.String r5 = "name"
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 166(0xa6, float:2.33E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.microsoft.XtraBox.ajc$tjp_2 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getFirstDateValue"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.microsoft.XtraBox"
            java.lang.String r4 = "java.lang.String"
            java.lang.String r5 = "name"
            java.lang.String r6 = ""
            java.lang.String r7 = "java.util.Date"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 183(0xb7, float:2.56E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.microsoft.XtraBox.ajc$tjp_3 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getFirstLongValue"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.microsoft.XtraBox"
            java.lang.String r4 = "java.lang.String"
            java.lang.String r5 = "name"
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.Long"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 200(0xc8, float:2.8E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.microsoft.XtraBox.ajc$tjp_4 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getValues"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.microsoft.XtraBox"
            java.lang.String r4 = "java.lang.String"
            java.lang.String r5 = "name"
            java.lang.String r6 = ""
            java.lang.String r7 = "[Ljava.lang.Object;"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 216(0xd8, float:3.03E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.microsoft.XtraBox.ajc$tjp_5 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "removeTag"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.microsoft.XtraBox"
            java.lang.String r4 = "java.lang.String"
            java.lang.String r5 = "name"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 236(0xec, float:3.31E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.microsoft.XtraBox.ajc$tjp_6 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setTagValues"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.microsoft.XtraBox"
            java.lang.String r4 = "java.lang.String:[Ljava.lang.String;"
            java.lang.String r5 = "name:values"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 249(0xf9, float:3.49E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.microsoft.XtraBox.ajc$tjp_7 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setTagValue"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.microsoft.XtraBox"
            java.lang.String r4 = "java.lang.String:java.lang.String"
            java.lang.String r5 = "name:value"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 265(0x109, float:3.71E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.microsoft.XtraBox.ajc$tjp_8 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setTagValue"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.microsoft.XtraBox"
            java.lang.String r4 = "java.lang.String:java.util.Date"
            java.lang.String r5 = "name:date"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 276(0x114, float:3.87E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.microsoft.XtraBox.ajc$tjp_9 = r0
            return
    }

    private int detailSize() {
            r3 = this;
            r0 = 0
            r1 = 0
        L2:
            java.util.Vector<com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraTag> r2 = r3.tags
            int r2 = r2.size()
            if (r0 < r2) goto Lb
            return r1
        Lb:
            java.util.Vector<com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraTag> r2 = r3.tags
            java.lang.Object r2 = r2.elementAt(r0)
            com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraTag r2 = (com.googlecode.mp4parser.boxes.microsoft.XtraBox.XtraTag) r2
            int r2 = com.googlecode.mp4parser.boxes.microsoft.XtraBox.XtraTag.access$0(r2)
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L2
    }

    private static long filetimeToMillis(long r2) {
            r0 = 10000(0x2710, double:4.9407E-320)
            long r2 = r2 / r0
            r0 = 11644473600000(0xa9730b66800, double:5.7531343696653E-311)
            long r2 = r2 - r0
            return r2
    }

    private com.googlecode.mp4parser.boxes.microsoft.XtraBox.XtraTag getTagByName(java.lang.String r4) {
            r3 = this;
            java.util.Vector<com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraTag> r0 = r3.tags
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto Le
            r4 = 0
            return r4
        Le:
            java.lang.Object r1 = r0.next()
            com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraTag r1 = (com.googlecode.mp4parser.boxes.microsoft.XtraBox.XtraTag) r1
            java.lang.String r2 = com.googlecode.mp4parser.boxes.microsoft.XtraBox.XtraTag.access$2(r1)
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L6
            return r1
    }

    private static long millisToFiletime(long r2) {
            r0 = 11644473600000(0xa9730b66800, double:5.7531343696653E-311)
            long r2 = r2 + r0
            r0 = 10000(0x2710, double:4.9407E-320)
            long r2 = r2 * r0
            return r2
    }

    private static java.lang.String readAsciiString(java.nio.ByteBuffer r1, int r2) {
            byte[] r2 = new byte[r2]
            r1.get(r2)
            java.lang.String r1 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> Ld
            java.lang.String r0 = "US-ASCII"
            r1.<init>(r2, r0)     // Catch: java.io.UnsupportedEncodingException -> Ld
            return r1
        Ld:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r0 = "Shouldn't happen"
            r2.<init>(r0, r1)
            throw r2
    }

    private static java.lang.String readUtf16String(java.nio.ByteBuffer r3, int r4) {
            int r4 = r4 / 2
            int r4 = r4 + (-1)
            char[] r0 = new char[r4]
            r1 = 0
        L7:
            if (r1 < r4) goto L12
            r3.getChar()
            java.lang.String r3 = new java.lang.String
            r3.<init>(r0)
            return r3
        L12:
            char r2 = r3.getChar()
            r0[r1] = r2
            int r1 = r1 + 1
            goto L7
    }

    private static void writeAsciiString(java.nio.ByteBuffer r1, java.lang.String r2) {
            java.lang.String r0 = "US-ASCII"
            byte[] r2 = r2.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> La
            r1.put(r2)     // Catch: java.io.UnsupportedEncodingException -> La
            return
        La:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r0 = "Shouldn't happen"
            r2.<init>(r0, r1)
            throw r2
    }

    private static void writeUtf16String(java.nio.ByteBuffer r3, java.lang.String r4) {
            char[] r4 = r4.toCharArray()
            r0 = 0
            r1 = 0
        L6:
            int r2 = r4.length
            if (r1 < r2) goto Ld
            r3.putChar(r0)
            return
        Ld:
            char r2 = r4[r1]
            r3.putChar(r2)
            int r1 = r1 + 1
            goto L6
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(java.nio.ByteBuffer r7) {
            r6 = this;
            int r0 = r7.remaining()
            java.nio.ByteBuffer r1 = r7.slice()
            r6.data = r1
            r1 = 0
            r6.successfulParse = r1
            java.util.Vector<com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraTag> r2 = r6.tags     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            r2.clear()     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
        L12:
            int r2 = r7.remaining()     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            if (r2 > 0) goto L48
            int r2 = r6.detailSize()     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            if (r0 != r2) goto L27
            r0 = 1
            r6.successfulParse = r0     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
        L21:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r7.order(r0)
            goto L83
        L27:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            java.lang.String r5 = "Improperly handled Xtra tag: Calculated sizes don't match ( "
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            r4.append(r0)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            java.lang.String r0 = "/"
            r4.append(r0)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            r4.append(r2)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            java.lang.String r0 = ")"
            r4.append(r0)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            throw r3     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
        L48:
            com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraTag r2 = new com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraTag     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            r3 = 0
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            com.googlecode.mp4parser.boxes.microsoft.XtraBox.XtraTag.access$4(r2, r7)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            java.util.Vector<com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraTag> r3 = r6.tags     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            r3.addElement(r2)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            goto L12
        L57:
            r0 = move-exception
            goto L84
        L59:
            r0 = move-exception
            r6.successfulParse = r1     // Catch: java.lang.Throwable -> L57
            java.io.PrintStream r1 = java.lang.System.err     // Catch: java.lang.Throwable -> L57
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = "Malformed Xtra Tag detected: "
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Throwable -> L57
            r2.append(r3)     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L57
            r1.println(r2)     // Catch: java.lang.Throwable -> L57
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L57
            int r0 = r7.position()     // Catch: java.lang.Throwable -> L57
            int r1 = r7.remaining()     // Catch: java.lang.Throwable -> L57
            int r0 = r0 + r1
            r7.position(r0)     // Catch: java.lang.Throwable -> L57
            goto L21
        L83:
            return
        L84:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r7.order(r1)
            throw r0
    }

    public java.lang.String[] getAllTagNames() {
            r3 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.microsoft.XtraBox.ajc$tjp_1
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r3, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.util.Vector<com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraTag> r0 = r3.tags
            int r0 = r0.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
        L16:
            java.util.Vector<com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraTag> r2 = r3.tags
            int r2 = r2.size()
            if (r1 < r2) goto L1f
            return r0
        L1f:
            java.util.Vector<com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraTag> r2 = r3.tags
            java.lang.Object r2 = r2.elementAt(r1)
            com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraTag r2 = (com.googlecode.mp4parser.boxes.microsoft.XtraBox.XtraTag) r2
            java.lang.String r2 = com.googlecode.mp4parser.boxes.microsoft.XtraBox.XtraTag.access$2(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L16
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r3) {
            r2 = this;
            boolean r0 = r2.successfulParse
            if (r0 == 0) goto L1c
            r0 = 0
        L5:
            java.util.Vector<com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraTag> r1 = r2.tags
            int r1 = r1.size()
            if (r0 < r1) goto Le
            goto L26
        Le:
            java.util.Vector<com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraTag> r1 = r2.tags
            java.lang.Object r1 = r1.elementAt(r0)
            com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraTag r1 = (com.googlecode.mp4parser.boxes.microsoft.XtraBox.XtraTag) r1
            com.googlecode.mp4parser.boxes.microsoft.XtraBox.XtraTag.access$5(r1, r3)
            int r0 = r0 + 1
            goto L5
        L1c:
            java.nio.ByteBuffer r0 = r2.data
            r0.rewind()
            java.nio.ByteBuffer r0 = r2.data
            r3.put(r0)
        L26:
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r2 = this;
            boolean r0 = r2.successfulParse
            if (r0 == 0) goto La
            int r0 = r2.detailSize()
        L8:
            long r0 = (long) r0
            return r0
        La:
            java.nio.ByteBuffer r0 = r2.data
            int r0 = r0.limit()
            goto L8
    }

    public java.util.Date getFirstDateValue(java.lang.String r5) {
            r4 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.microsoft.XtraBox.ajc$tjp_3
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r4, r4, r5)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.Object[] r5 = r4.getValues(r5)
            int r0 = r5.length
            r1 = 0
        L13:
            if (r1 < r0) goto L17
            r5 = 0
            return r5
        L17:
            r2 = r5[r1]
            boolean r3 = r2 instanceof java.util.Date
            if (r3 == 0) goto L20
            java.util.Date r2 = (java.util.Date) r2
            return r2
        L20:
            int r1 = r1 + 1
            goto L13
    }

    public java.lang.Long getFirstLongValue(java.lang.String r5) {
            r4 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.microsoft.XtraBox.ajc$tjp_4
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r4, r4, r5)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.Object[] r5 = r4.getValues(r5)
            int r0 = r5.length
            r1 = 0
        L13:
            if (r1 < r0) goto L17
            r5 = 0
            return r5
        L17:
            r2 = r5[r1]
            boolean r3 = r2 instanceof java.lang.Long
            if (r3 == 0) goto L20
            java.lang.Long r2 = (java.lang.Long) r2
            return r2
        L20:
            int r1 = r1 + 1
            goto L13
    }

    public java.lang.String getFirstStringValue(java.lang.String r5) {
            r4 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.microsoft.XtraBox.ajc$tjp_2
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r4, r4, r5)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.Object[] r5 = r4.getValues(r5)
            int r0 = r5.length
            r1 = 0
        L13:
            if (r1 < r0) goto L17
            r5 = 0
            return r5
        L17:
            r2 = r5[r1]
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L20
            java.lang.String r2 = (java.lang.String) r2
            return r2
        L20:
            int r1 = r1 + 1
            goto L13
    }

    public java.lang.Object[] getValues(java.lang.String r4) {
            r3 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.microsoft.XtraBox.ajc$tjp_5
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r3, r3, r4)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraTag r4 = r3.getTagByName(r4)
            r0 = 0
            if (r4 == 0) goto L3c
            java.util.Vector r1 = com.googlecode.mp4parser.boxes.microsoft.XtraBox.XtraTag.access$1(r4)
            int r1 = r1.size()
            java.lang.Object[] r1 = new java.lang.Object[r1]
        L1e:
            java.util.Vector r2 = com.googlecode.mp4parser.boxes.microsoft.XtraBox.XtraTag.access$1(r4)
            int r2 = r2.size()
            if (r0 < r2) goto L29
            goto L3e
        L29:
            java.util.Vector r2 = com.googlecode.mp4parser.boxes.microsoft.XtraBox.XtraTag.access$1(r4)
            java.lang.Object r2 = r2.elementAt(r0)
            com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraValue r2 = (com.googlecode.mp4parser.boxes.microsoft.XtraBox.XtraValue) r2
            java.lang.Object r2 = com.googlecode.mp4parser.boxes.microsoft.XtraBox.XtraValue.access$4(r2)
            r1[r0] = r2
            int r0 = r0 + 1
            goto L1e
        L3c:
            java.lang.Object[] r1 = new java.lang.Object[r0]
        L3e:
            return r1
    }

    public void removeTag(java.lang.String r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.microsoft.XtraBox.ajc$tjp_6
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraTag r3 = r2.getTagByName(r3)
            if (r3 == 0) goto L18
            java.util.Vector<com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraTag> r0 = r2.tags
            r0.remove(r3)
        L18:
            return
    }

    public void setTagValue(java.lang.String r4, long r5) {
            r3 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.microsoft.XtraBox.ajc$tjp_10
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.longObject(r5)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r3, r3, r4, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r3.removeTag(r4)
            com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraTag r0 = new com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraTag
            r1 = 0
            r0.<init>(r4, r1)
            java.util.Vector r4 = com.googlecode.mp4parser.boxes.microsoft.XtraBox.XtraTag.access$1(r0)
            com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraValue r2 = new com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraValue
            r2.<init>(r5, r1)
            r4.addElement(r2)
            java.util.Vector<com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraTag> r4 = r3.tags
            r4.addElement(r0)
            return
    }

    public void setTagValue(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.microsoft.XtraBox.ajc$tjp_8
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3, r4)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            r0[r1] = r4
            r2.setTagValues(r3, r0)
            return
    }

    public void setTagValue(java.lang.String r4, java.util.Date r5) {
            r3 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.microsoft.XtraBox.ajc$tjp_9
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r3, r3, r4, r5)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r3.removeTag(r4)
            com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraTag r0 = new com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraTag
            r1 = 0
            r0.<init>(r4, r1)
            java.util.Vector r4 = com.googlecode.mp4parser.boxes.microsoft.XtraBox.XtraTag.access$1(r0)
            com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraValue r2 = new com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraValue
            r2.<init>(r5, r1)
            r4.addElement(r2)
            java.util.Vector<com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraTag> r4 = r3.tags
            r4.addElement(r0)
            return
    }

    public void setTagValues(java.lang.String r6, java.lang.String[] r7) {
            r5 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.microsoft.XtraBox.ajc$tjp_7
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r5, r5, r6, r7)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r5.removeTag(r6)
            com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraTag r0 = new com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraTag
            r1 = 0
            r0.<init>(r6, r1)
            r6 = 0
        L17:
            int r2 = r7.length
            if (r6 < r2) goto L20
            java.util.Vector<com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraTag> r6 = r5.tags
            r6.addElement(r0)
            return
        L20:
            java.util.Vector r2 = com.googlecode.mp4parser.boxes.microsoft.XtraBox.XtraTag.access$1(r0)
            com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraValue r3 = new com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraValue
            r4 = r7[r6]
            r3.<init>(r4, r1)
            r2.addElement(r3)
            int r6 = r6 + 1
            goto L17
    }

    public java.lang.String toString() {
            r6 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.microsoft.XtraBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r6, r6)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            boolean r0 = r6.isParsed()
            if (r0 != 0) goto L16
            r6.parseDetails()
        L16:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = "XtraBox["
            r0.append(r1)
            java.util.Vector<com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraTag> r1 = r6.tags
            java.util.Iterator r1 = r1.iterator()
        L26:
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L36
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L36:
            java.lang.Object r2 = r1.next()
            com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraTag r2 = (com.googlecode.mp4parser.boxes.microsoft.XtraBox.XtraTag) r2
            java.util.Vector r3 = com.googlecode.mp4parser.boxes.microsoft.XtraBox.XtraTag.access$1(r2)
            java.util.Iterator r3 = r3.iterator()
        L44:
            boolean r4 = r3.hasNext()
            if (r4 != 0) goto L4b
            goto L26
        L4b:
            java.lang.Object r4 = r3.next()
            com.googlecode.mp4parser.boxes.microsoft.XtraBox$XtraValue r4 = (com.googlecode.mp4parser.boxes.microsoft.XtraBox.XtraValue) r4
            java.lang.String r5 = com.googlecode.mp4parser.boxes.microsoft.XtraBox.XtraTag.access$2(r2)
            r0.append(r5)
            java.lang.String r5 = "="
            r0.append(r5)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            java.lang.String r4 = ";"
            r0.append(r4)
            goto L44
    }
}
