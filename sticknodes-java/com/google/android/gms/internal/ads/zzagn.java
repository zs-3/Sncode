package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzagn extends com.google.android.gms.internal.ads.zzagv {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzagn> CREATOR = null;
    public final java.lang.String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final java.lang.String[] zzd;
    private final com.google.android.gms.internal.ads.zzagv[] zze;

    static {
            com.google.android.gms.internal.ads.zzagm r0 = new com.google.android.gms.internal.ads.zzagm
            r0.<init>()
            com.google.android.gms.internal.ads.zzagn.CREATOR = r0
            return
    }

    zzagn(android.os.Parcel r5) {
            r4 = this;
            java.lang.String r0 = "CTOC"
            r4.<init>(r0)
            java.lang.String r0 = r5.readString()
            int r1 = com.google.android.gms.internal.ads.zzeu.zza
            r4.zza = r0
            byte r0 = r5.readByte()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L17
            r0 = 1
            goto L18
        L17:
            r0 = 0
        L18:
            r4.zzb = r0
            byte r0 = r5.readByte()
            if (r0 == 0) goto L21
            goto L22
        L21:
            r1 = 0
        L22:
            r4.zzc = r1
            java.lang.String[] r0 = r5.createStringArray()
            r4.zzd = r0
            int r0 = r5.readInt()
            com.google.android.gms.internal.ads.zzagv[] r1 = new com.google.android.gms.internal.ads.zzagv[r0]
            r4.zze = r1
        L32:
            if (r2 >= r0) goto L47
            com.google.android.gms.internal.ads.zzagv[] r1 = r4.zze
            java.lang.Class<com.google.android.gms.internal.ads.zzagv> r3 = com.google.android.gms.internal.ads.zzagv.class
            java.lang.ClassLoader r3 = r3.getClassLoader()
            android.os.Parcelable r3 = r5.readParcelable(r3)
            com.google.android.gms.internal.ads.zzagv r3 = (com.google.android.gms.internal.ads.zzagv) r3
            r1[r2] = r3
            int r2 = r2 + 1
            goto L32
        L47:
            return
    }

    public zzagn(java.lang.String r2, boolean r3, boolean r4, java.lang.String[] r5, com.google.android.gms.internal.ads.zzagv[] r6) {
            r1 = this;
            java.lang.String r0 = "CTOC"
            r1.<init>(r0)
            r1.zza = r2
            r1.zzb = r3
            r1.zzc = r4
            r1.zzd = r5
            r1.zze = r6
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L3d
            java.lang.Class<com.google.android.gms.internal.ads.zzagn> r2 = com.google.android.gms.internal.ads.zzagn.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L3d
        L10:
            com.google.android.gms.internal.ads.zzagn r5 = (com.google.android.gms.internal.ads.zzagn) r5
            boolean r2 = r4.zzb
            boolean r3 = r5.zzb
            if (r2 != r3) goto L3d
            boolean r2 = r4.zzc
            boolean r3 = r5.zzc
            if (r2 != r3) goto L3d
            java.lang.String r2 = r4.zza
            java.lang.String r3 = r5.zza
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L3d
            java.lang.String[] r2 = r4.zzd
            java.lang.String[] r3 = r5.zzd
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 == 0) goto L3d
            com.google.android.gms.internal.ads.zzagv[] r2 = r4.zze
            com.google.android.gms.internal.ads.zzagv[] r5 = r5.zze
            boolean r5 = java.util.Arrays.equals(r2, r5)
            if (r5 == 0) goto L3d
            return r0
        L3d:
            return r1
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.zza
            if (r0 == 0) goto L9
            int r0 = r0.hashCode()
            goto La
        L9:
            r0 = 0
        La:
            boolean r1 = r3.zzb
            boolean r2 = r3.zzc
            int r1 = r1 + 527
            int r1 = r1 * 31
            int r1 = r1 + r2
            int r1 = r1 * 31
            int r1 = r1 + r0
            return r1
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            java.lang.String r6 = r4.zza
            r5.writeString(r6)
            boolean r6 = r4.zzb
            r5.writeByte(r6)
            boolean r6 = r4.zzc
            r5.writeByte(r6)
            java.lang.String[] r6 = r4.zzd
            r5.writeStringArray(r6)
            com.google.android.gms.internal.ads.zzagv[] r6 = r4.zze
            int r6 = r6.length
            r5.writeInt(r6)
            com.google.android.gms.internal.ads.zzagv[] r6 = r4.zze
            int r0 = r6.length
            r1 = 0
            r2 = 0
        L1f:
            if (r2 >= r0) goto L29
            r3 = r6[r2]
            r5.writeParcelable(r3, r1)
            int r2 = r2 + 1
            goto L1f
        L29:
            return
    }
}
