package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzgzs implements java.lang.Iterable<java.lang.Byte>, java.io.Serializable {
    public static final com.google.android.gms.internal.ads.zzgzs zzb = null;
    private int zza;

    static {
            com.google.android.gms.internal.ads.zzgzq r0 = new com.google.android.gms.internal.ads.zzgzq
            byte[] r1 = com.google.android.gms.internal.ads.zzhbr.zzb
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzgzs.zzb = r0
            int r0 = com.google.android.gms.internal.ads.zzgzf.zza
            return
    }

    zzgzs() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zza = r0
            return
    }

    private static com.google.android.gms.internal.ads.zzgzs zzc(java.util.Iterator r3, int r4) {
            r0 = 1
            if (r4 <= 0) goto L51
            if (r4 != r0) goto Lc
            java.lang.Object r3 = r3.next()
            com.google.android.gms.internal.ads.zzgzs r3 = (com.google.android.gms.internal.ads.zzgzs) r3
            goto L29
        Lc:
            int r0 = r4 >>> 1
            com.google.android.gms.internal.ads.zzgzs r1 = zzc(r3, r0)
            int r4 = r4 - r0
            com.google.android.gms.internal.ads.zzgzs r3 = zzc(r3, r4)
            r4 = 2147483647(0x7fffffff, float:NaN)
            int r0 = r1.zzd()
            int r4 = r4 - r0
            int r0 = r3.zzd()
            if (r4 < r0) goto L2a
            com.google.android.gms.internal.ads.zzgzs r3 = com.google.android.gms.internal.ads.zzhdj.zzC(r1, r3)
        L29:
            return r3
        L2a:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            int r0 = r1.zzd()
            int r3 = r3.zzd()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ByteString would be too long: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "+"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r4.<init>(r3)
            throw r4
        L51:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0[r1] = r4
            java.lang.String r4 = "length (%s) must be >= 1"
            java.lang.String r4 = java.lang.String.format(r4, r0)
            r3.<init>(r4)
            throw r3
    }

    static int zzq(int r3, int r4, int r5) {
            r0 = r3 | r4
            int r1 = r4 - r3
            r0 = r0 | r1
            int r2 = r5 - r4
            r0 = r0 | r2
            if (r0 >= 0) goto L68
            if (r3 < 0) goto L4c
            if (r4 >= r3) goto L2d
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Beginning index larger than ending index: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = ", "
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            r5.<init>(r3)
            throw r5
        L2d:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "End index: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = " >= "
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        L4c:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Beginning index: "
            r5.append(r0)
            r5.append(r3)
            java.lang.String r3 = " < 0"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
        L68:
            return r1
    }

    public static com.google.android.gms.internal.ads.zzgzr zzt() {
            com.google.android.gms.internal.ads.zzgzr r0 = new com.google.android.gms.internal.ads.zzgzr
            r1 = 128(0x80, float:1.794E-43)
            r0.<init>(r1)
            return r0
    }

    public static com.google.android.gms.internal.ads.zzgzs zzu(java.lang.Iterable r3) {
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 != 0) goto L15
            java.util.Iterator r0 = r3.iterator()
            r1 = 0
        L9:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1c
            r0.next()
            int r1 = r1 + 1
            goto L9
        L15:
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            int r1 = r0.size()
        L1c:
            if (r1 != 0) goto L21
            com.google.android.gms.internal.ads.zzgzs r3 = com.google.android.gms.internal.ads.zzgzs.zzb
            return r3
        L21:
            java.util.Iterator r3 = r3.iterator()
            com.google.android.gms.internal.ads.zzgzs r3 = zzc(r3, r1)
            return r3
    }

    public static com.google.android.gms.internal.ads.zzgzs zzv(byte[] r3, int r4, int r5) {
            int r0 = r4 + r5
            int r1 = r3.length
            zzq(r4, r0, r1)
            com.google.android.gms.internal.ads.zzgzq r0 = new com.google.android.gms.internal.ads.zzgzq
            byte[] r1 = new byte[r5]
            r2 = 0
            java.lang.System.arraycopy(r3, r4, r1, r2, r5)
            r0.<init>(r1)
            return r0
    }

    public static com.google.android.gms.internal.ads.zzgzs zzw(java.lang.String r2) {
            com.google.android.gms.internal.ads.zzgzq r0 = new com.google.android.gms.internal.ads.zzgzq
            java.nio.charset.Charset r1 = com.google.android.gms.internal.ads.zzhbr.zza
            byte[] r2 = r2.getBytes(r1)
            r0.<init>(r2)
            return r0
    }

    static void zzy(int r3, int r4) {
            int r0 = r3 + 1
            int r0 = r4 - r0
            r0 = r0 | r3
            if (r0 >= 0) goto L3f
            if (r3 >= 0) goto L20
            java.lang.ArrayIndexOutOfBoundsException r4 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Index < 0: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L20:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Index > length: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = ", "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L3f:
            return
    }

    public abstract boolean equals(java.lang.Object r1);

    public final int hashCode() {
            r2 = this;
            int r0 = r2.zza
            if (r0 != 0) goto L12
            r0 = 0
            int r1 = r2.zzd()
            int r0 = r2.zzi(r1, r0, r1)
            if (r0 != 0) goto L10
            r0 = 1
        L10:
            r2.zza = r0
        L12:
            return r0
    }

    @Override // java.lang.Iterable
    public /* bridge */ /* synthetic */ java.util.Iterator<java.lang.Byte> iterator() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgzn r0 = r1.zzs()
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.util.Locale r0 = java.util.Locale.ROOT
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r2 = java.lang.System.identityHashCode(r5)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r3 = 0
            r1[r3] = r2
            int r2 = r5.zzd()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = 1
            r1[r4] = r2
            int r2 = r5.zzd()
            r4 = 50
            if (r2 > r4) goto L28
            java.lang.String r2 = com.google.android.gms.internal.ads.zzhdw.zza(r5)
            goto L38
        L28:
            r2 = 47
            com.google.android.gms.internal.ads.zzgzs r2 = r5.zzk(r3, r2)
            java.lang.String r2 = com.google.android.gms.internal.ads.zzhdw.zza(r2)
            java.lang.String r3 = "..."
            java.lang.String r2 = r2.concat(r3)
        L38:
            r3 = 2
            r1[r3] = r2
            java.lang.String r2 = "<ByteString@%s size=%d contents=\"%s\">"
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)
            return r0
    }

    public final byte[] zzA() {
            r3 = this;
            int r0 = r3.zzd()
            if (r0 != 0) goto L9
            byte[] r0 = com.google.android.gms.internal.ads.zzhbr.zzb
            return r0
        L9:
            byte[] r1 = new byte[r0]
            r2 = 0
            r3.zze(r1, r2, r2, r0)
            return r1
    }

    public abstract byte zza(int r1);

    abstract byte zzb(int r1);

    public abstract int zzd();

    protected abstract void zze(byte[] r1, int r2, int r3, int r4);

    protected abstract int zzf();

    protected abstract boolean zzh();

    protected abstract int zzi(int r1, int r2, int r3);

    protected abstract int zzj(int r1, int r2, int r3);

    public abstract com.google.android.gms.internal.ads.zzgzs zzk(int r1, int r2);

    public abstract com.google.android.gms.internal.ads.zzhac zzl();

    protected abstract java.lang.String zzm(java.nio.charset.Charset r1);

    public abstract java.nio.ByteBuffer zzn();

    abstract void zzo(com.google.android.gms.internal.ads.zzgzj r1) throws java.io.IOException;

    public abstract boolean zzp();

    protected final int zzr() {
            r1 = this;
            int r0 = r1.zza
            return r0
    }

    public com.google.android.gms.internal.ads.zzgzn zzs() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgzk r0 = new com.google.android.gms.internal.ads.zzgzk
            r0.<init>(r1)
            return r0
    }

    public final java.lang.String zzx() {
            r2 = this;
            java.nio.charset.Charset r0 = com.google.android.gms.internal.ads.zzhbr.zza
            int r1 = r2.zzd()
            if (r1 != 0) goto Lb
            java.lang.String r0 = ""
            goto Lf
        Lb:
            java.lang.String r0 = r2.zzm(r0)
        Lf:
            return r0
    }

    @java.lang.Deprecated
    public final void zzz(byte[] r3, int r4, int r5, int r6) {
            r2 = this;
            int r4 = r2.zzd()
            r0 = 0
            zzq(r0, r6, r4)
            int r4 = r5 + r6
            int r1 = r3.length
            zzq(r5, r4, r1)
            if (r6 <= 0) goto L13
            r2.zze(r3, r0, r5, r6)
        L13:
            return
    }
}
