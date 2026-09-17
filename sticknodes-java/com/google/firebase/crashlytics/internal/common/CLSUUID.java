package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes2.dex */
class CLSUUID {
    private static final java.lang.String ID_SHA = null;
    private static final java.util.concurrent.atomic.AtomicLong sequenceNumber = null;
    private final java.lang.String sessionId;

    static {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            long r1 = java.lang.System.currentTimeMillis()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = com.google.firebase.crashlytics.internal.common.CommonUtils.sha1(r0)
            com.google.firebase.crashlytics.internal.common.CLSUUID.ID_SHA = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            com.google.firebase.crashlytics.internal.common.CLSUUID.sequenceNumber = r0
            return
    }

    CLSUUID() {
            r8 = this;
            r8.<init>()
            r0 = 10
            byte[] r0 = new byte[r0]
            r8.populateTime(r0)
            r8.populateSequenceNumber(r0)
            r8.populatePID(r0)
            java.lang.String r0 = com.google.firebase.crashlytics.internal.common.CommonUtils.hexify(r0)
            java.util.Locale r1 = java.util.Locale.US
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r4 = 12
            java.lang.String r5 = r0.substring(r3, r4)
            r2[r3] = r5
            r5 = 16
            java.lang.String r6 = r0.substring(r4, r5)
            r7 = 1
            r2[r7] = r6
            r6 = 20
            java.lang.CharSequence r0 = r0.subSequence(r5, r6)
            r5 = 2
            r2[r5] = r0
            java.lang.String r0 = com.google.firebase.crashlytics.internal.common.CLSUUID.ID_SHA
            java.lang.String r0 = r0.substring(r3, r4)
            r3 = 3
            r2[r3] = r0
            java.lang.String r0 = "%s%s%s%s"
            java.lang.String r0 = java.lang.String.format(r1, r0, r2)
            java.lang.String r0 = r0.toUpperCase(r1)
            r8.sessionId = r0
            return
    }

    private static byte[] convertLongToFourByteBuffer(long r1) {
            r0 = 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            int r2 = (int) r1
            r0.putInt(r2)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r0.order(r1)
            r1 = 0
            r0.position(r1)
            byte[] r1 = r0.array()
            return r1
    }

    private static byte[] convertLongToTwoByteBuffer(long r1) {
            r0 = 2
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            int r2 = (int) r1
            short r1 = (short) r2
            r0.putShort(r1)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r0.order(r1)
            r1 = 0
            r0.position(r1)
            byte[] r1 = r0.array()
            return r1
    }

    private void populatePID(byte[] r4) {
            r3 = this;
            int r0 = android.os.Process.myPid()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            short r0 = r0.shortValue()
            long r0 = (long) r0
            byte[] r0 = convertLongToTwoByteBuffer(r0)
            r1 = 0
            r1 = r0[r1]
            r2 = 8
            r4[r2] = r1
            r1 = 1
            r0 = r0[r1]
            r1 = 9
            r4[r1] = r0
            return
    }

    private void populateSequenceNumber(byte[] r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicLong r0 = com.google.firebase.crashlytics.internal.common.CLSUUID.sequenceNumber
            long r0 = r0.incrementAndGet()
            byte[] r0 = convertLongToTwoByteBuffer(r0)
            r1 = 0
            r1 = r0[r1]
            r2 = 6
            r4[r2] = r1
            r1 = 1
            r0 = r0[r1]
            r1 = 7
            r4[r1] = r0
            return
    }

    private void populateTime(byte[] r8) {
            r7 = this;
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            long r0 = r0.getTime()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r4 = r0 / r2
            long r0 = r0 % r2
            byte[] r2 = convertLongToFourByteBuffer(r4)
            r3 = 0
            r4 = r2[r3]
            r8[r3] = r4
            r4 = 1
            r5 = r2[r4]
            r8[r4] = r5
            r5 = 2
            r6 = r2[r5]
            r8[r5] = r6
            r5 = 3
            r2 = r2[r5]
            r8[r5] = r2
            byte[] r0 = convertLongToTwoByteBuffer(r0)
            r1 = r0[r3]
            r2 = 4
            r8[r2] = r1
            r0 = r0[r4]
            r1 = 5
            r8[r1] = r0
            return
    }

    public java.lang.String getSessionId() {
            r1 = this;
            java.lang.String r0 = r1.sessionId
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.sessionId
            return r0
    }
}
