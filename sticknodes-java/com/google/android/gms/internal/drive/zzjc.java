package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public abstract class zzjc implements java.io.Serializable, java.lang.Iterable<java.lang.Byte> {
    public static final com.google.android.gms.internal.drive.zzjc zznq = null;
    private static final com.google.android.gms.internal.drive.zzji zznr = null;
    private static final java.util.Comparator<com.google.android.gms.internal.drive.zzjc> zznt = null;
    private int zzns;

    static {
            com.google.android.gms.internal.drive.zzjm r0 = new com.google.android.gms.internal.drive.zzjm
            byte[] r1 = com.google.android.gms.internal.drive.zzkm.zzsn
            r0.<init>(r1)
            com.google.android.gms.internal.drive.zzjc.zznq = r0
            boolean r0 = com.google.android.gms.internal.drive.zzix.zzbr()
            r1 = 0
            if (r0 == 0) goto L16
            com.google.android.gms.internal.drive.zzjn r0 = new com.google.android.gms.internal.drive.zzjn
            r0.<init>(r1)
            goto L1b
        L16:
            com.google.android.gms.internal.drive.zzjg r0 = new com.google.android.gms.internal.drive.zzjg
            r0.<init>(r1)
        L1b:
            com.google.android.gms.internal.drive.zzjc.zznr = r0
            com.google.android.gms.internal.drive.zzje r0 = new com.google.android.gms.internal.drive.zzje
            r0.<init>()
            com.google.android.gms.internal.drive.zzjc.zznt = r0
            return
    }

    zzjc() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zzns = r0
            return
    }

    private static int zza(byte r0) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    static /* synthetic */ int zzb(byte r0) {
            int r0 = zza(r0)
            return r0
    }

    static int zzb(int r3, int r4, int r5) {
            int r0 = r4 - r3
            r1 = r3 | r4
            r1 = r1 | r0
            int r2 = r5 - r4
            r1 = r1 | r2
            if (r1 >= 0) goto L6e
            if (r3 < 0) goto L50
            if (r4 >= r3) goto L2f
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            r0 = 66
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Beginning index larger than ending index: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = ", "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            r5.<init>(r3)
            throw r5
        L2f:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            r0 = 37
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "End index: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r4 = " >= "
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = r1.toString()
            r3.<init>(r4)
            throw r3
        L50:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            r5 = 32
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            java.lang.String r5 = "Beginning index: "
            r0.append(r5)
            r0.append(r3)
            java.lang.String r3 = " < 0"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L6e:
            return r0
    }

    public static com.google.android.gms.internal.drive.zzjc zzb(byte[] r2, int r3, int r4) {
            int r0 = r3 + r4
            int r1 = r2.length
            zzb(r3, r0, r1)
            com.google.android.gms.internal.drive.zzjm r0 = new com.google.android.gms.internal.drive.zzjm
            com.google.android.gms.internal.drive.zzji r1 = com.google.android.gms.internal.drive.zzjc.zznr
            byte[] r2 = r1.zzc(r2, r3, r4)
            r0.<init>(r2)
            return r0
    }

    public static com.google.android.gms.internal.drive.zzjc zzk(java.lang.String r2) {
            com.google.android.gms.internal.drive.zzjm r0 = new com.google.android.gms.internal.drive.zzjm
            java.nio.charset.Charset r1 = com.google.android.gms.internal.drive.zzkm.UTF_8
            byte[] r2 = r2.getBytes(r1)
            r0.<init>(r2)
            return r0
    }

    static com.google.android.gms.internal.drive.zzjk zzu(int r2) {
            com.google.android.gms.internal.drive.zzjk r0 = new com.google.android.gms.internal.drive.zzjk
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public abstract boolean equals(java.lang.Object r1);

    public final int hashCode() {
            r2 = this;
            int r0 = r2.zzns
            if (r0 != 0) goto L12
            int r0 = r2.size()
            r1 = 0
            int r0 = r2.zza(r0, r1, r0)
            if (r0 != 0) goto L10
            r0 = 1
        L10:
            r2.zzns = r0
        L12:
            return r0
    }

    @Override // java.lang.Iterable
    public /* synthetic */ java.util.Iterator<java.lang.Byte> iterator() {
            r1 = this;
            com.google.android.gms.internal.drive.zzjd r0 = new com.google.android.gms.internal.drive.zzjd
            r0.<init>(r1)
            return r0
    }

    public abstract int size();

    public final java.lang.String toString() {
            r3 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = java.lang.System.identityHashCode(r3)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r2 = 0
            r0[r2] = r1
            int r1 = r3.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = "<ByteString@%s size=%d>"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
    }

    protected abstract int zza(int r1, int r2, int r3);

    public abstract com.google.android.gms.internal.drive.zzjc zza(int r1, int r2);

    protected abstract java.lang.String zza(java.nio.charset.Charset r1);

    abstract void zza(com.google.android.gms.internal.drive.zzjb r1) throws java.io.IOException;

    public final java.lang.String zzbt() {
            r2 = this;
            java.nio.charset.Charset r0 = com.google.android.gms.internal.drive.zzkm.UTF_8
            int r1 = r2.size()
            if (r1 != 0) goto Lb
            java.lang.String r0 = ""
            return r0
        Lb:
            java.lang.String r0 = r2.zza(r0)
            return r0
    }

    public abstract boolean zzbu();

    protected final int zzbv() {
            r1 = this;
            int r0 = r1.zzns
            return r0
    }

    public abstract byte zzs(int r1);

    abstract byte zzt(int r1);
}
