package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
public abstract class zzef implements java.lang.Iterable, java.io.Serializable {
    private static final java.util.Comparator zza = null;
    public static final com.google.android.gms.internal.auth.zzef zzb = null;
    private static final com.google.android.gms.internal.auth.zzee zzd = null;
    private int zzc;

    static {
            com.google.android.gms.internal.auth.zzec r0 = new com.google.android.gms.internal.auth.zzec
            byte[] r1 = com.google.android.gms.internal.auth.zzfa.zzd
            r0.<init>(r1)
            com.google.android.gms.internal.auth.zzef.zzb = r0
            int r0 = com.google.android.gms.internal.auth.zzds.zza
            com.google.android.gms.internal.auth.zzee r0 = new com.google.android.gms.internal.auth.zzee
            r1 = 0
            r0.<init>(r1)
            com.google.android.gms.internal.auth.zzef.zzd = r0
            com.google.android.gms.internal.auth.zzdx r0 = new com.google.android.gms.internal.auth.zzdx
            r0.<init>()
            com.google.android.gms.internal.auth.zzef.zza = r0
            return
    }

    zzef() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zzc = r0
            return
    }

    static int zzi(int r3, int r4, int r5) {
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

    public static com.google.android.gms.internal.auth.zzef zzk(byte[] r3, int r4, int r5) {
            int r0 = r4 + r5
            int r1 = r3.length
            zzi(r4, r0, r1)
            com.google.android.gms.internal.auth.zzec r0 = new com.google.android.gms.internal.auth.zzec
            byte[] r1 = new byte[r5]
            r2 = 0
            java.lang.System.arraycopy(r3, r4, r1, r2, r5)
            r0.<init>(r1)
            return r0
    }

    public abstract boolean equals(java.lang.Object r1);

    public final int hashCode() {
            r2 = this;
            int r0 = r2.zzc
            if (r0 != 0) goto L12
            r0 = 0
            int r1 = r2.zzd()
            int r0 = r2.zze(r1, r0, r1)
            if (r0 != 0) goto L10
            r0 = 1
        L10:
            r2.zzc = r0
        L12:
            return r0
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            com.google.android.gms.internal.auth.zzdw r0 = new com.google.android.gms.internal.auth.zzdw
            r0.<init>(r1)
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
            java.lang.String r2 = com.google.android.gms.internal.auth.zzgx.zza(r5)
            goto L38
        L28:
            r2 = 47
            com.google.android.gms.internal.auth.zzef r2 = r5.zzf(r3, r2)
            java.lang.String r2 = com.google.android.gms.internal.auth.zzgx.zza(r2)
            java.lang.String r3 = "..."
            java.lang.String r2 = r2.concat(r3)
        L38:
            r3 = 2
            r1[r3] = r2
            java.lang.String r2 = "<ByteString@%s size=%d contents=\"%s\">"
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)
            return r0
    }

    public abstract byte zza(int r1);

    abstract byte zzb(int r1);

    public abstract int zzd();

    protected abstract int zze(int r1, int r2, int r3);

    public abstract com.google.android.gms.internal.auth.zzef zzf(int r1, int r2);

    protected abstract java.lang.String zzg(java.nio.charset.Charset r1);

    public abstract boolean zzh();

    protected final int zzj() {
            r1 = this;
            int r0 = r1.zzc
            return r0
    }

    public final java.lang.String zzl(java.nio.charset.Charset r2) {
            r1 = this;
            int r0 = r1.zzd()
            if (r0 != 0) goto L9
            java.lang.String r2 = ""
            goto Ld
        L9:
            java.lang.String r2 = r1.zzg(r2)
        Ld:
            return r2
    }
}
