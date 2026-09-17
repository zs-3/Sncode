package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzx implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzx> CREATOR = null;
    public final java.util.UUID zza;
    public final java.lang.String zzb;
    public final java.lang.String zzc;
    public final byte[] zzd;
    private int zze;

    static {
            com.google.android.gms.internal.ads.zzw r0 = new com.google.android.gms.internal.ads.zzw
            r0.<init>()
            com.google.android.gms.internal.ads.zzx.CREATOR = r0
            return
    }

    zzx(android.os.Parcel r6) {
            r5 = this;
            r5.<init>()
            java.util.UUID r0 = new java.util.UUID
            long r1 = r6.readLong()
            long r3 = r6.readLong()
            r0.<init>(r1, r3)
            r5.zza = r0
            java.lang.String r0 = r6.readString()
            r5.zzb = r0
            java.lang.String r0 = r6.readString()
            int r1 = com.google.android.gms.internal.ads.zzeu.zza
            r5.zzc = r0
            byte[] r6 = r6.createByteArray()
            r5.zzd = r6
            return
    }

    public zzx(java.util.UUID r1, java.lang.String r2, java.lang.String r3, byte[] r4) {
            r0 = this;
            r0.<init>()
            java.util.Objects.requireNonNull(r1)
            r0.zza = r1
            r1 = 0
            r0.zzb = r1
            java.lang.String r1 = com.google.android.gms.internal.ads.zzbn.zze(r3)
            r0.zzc = r1
            r0.zzd = r4
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzx
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = 1
            if (r5 != r4) goto La
            return r0
        La:
            com.google.android.gms.internal.ads.zzx r5 = (com.google.android.gms.internal.ads.zzx) r5
            java.lang.String r2 = r4.zzb
            java.lang.String r3 = r5.zzb
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L35
            java.lang.String r2 = r4.zzc
            java.lang.String r3 = r5.zzc
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L35
            java.util.UUID r2 = r4.zza
            java.util.UUID r3 = r5.zza
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L35
            byte[] r2 = r4.zzd
            byte[] r5 = r5.zzd
            boolean r5 = java.util.Arrays.equals(r2, r5)
            if (r5 == 0) goto L35
            return r0
        L35:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.zze
            if (r0 != 0) goto L2b
            java.util.UUID r0 = r2.zza
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.zzb
            if (r1 != 0) goto L12
            r1 = 0
            goto L16
        L12:
            int r1 = r1.hashCode()
        L16:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.zzc
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            byte[] r1 = r2.zzd
            int r1 = java.util.Arrays.hashCode(r1)
            int r0 = r0 + r1
            r2.zze = r0
        L2b:
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            java.util.UUID r4 = r2.zza
            long r0 = r4.getMostSignificantBits()
            r3.writeLong(r0)
            java.util.UUID r4 = r2.zza
            long r0 = r4.getLeastSignificantBits()
            r3.writeLong(r0)
            java.lang.String r4 = r2.zzb
            r3.writeString(r4)
            java.lang.String r4 = r2.zzc
            r3.writeString(r4)
            byte[] r4 = r2.zzd
            r3.writeByteArray(r4)
            return
    }
}
