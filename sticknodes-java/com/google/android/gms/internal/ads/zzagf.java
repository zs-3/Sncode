package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzagf implements com.google.android.gms.internal.ads.zzbj {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzagf> CREATOR = null;
    public final int zza;
    public final java.lang.String zzb;
    public final java.lang.String zzc;
    public final java.lang.String zzd;
    public final boolean zze;
    public final int zzf;

    static {
            com.google.android.gms.internal.ads.zzage r0 = new com.google.android.gms.internal.ads.zzage
            r0.<init>()
            com.google.android.gms.internal.ads.zzagf.CREATOR = r0
            return
    }

    public zzagf(int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, boolean r7, int r8) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r1 = -1
            if (r8 == r1) goto Lb
            if (r8 <= 0) goto La
            goto Lb
        La:
            r0 = 0
        Lb:
            com.google.android.gms.internal.ads.zzdi.zzd(r0)
            r2.zza = r3
            r2.zzb = r4
            r2.zzc = r5
            r2.zzd = r6
            r2.zze = r7
            r2.zzf = r8
            return
    }

    zzagf(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            int r0 = r2.readInt()
            r1.zza = r0
            java.lang.String r0 = r2.readString()
            r1.zzb = r0
            java.lang.String r0 = r2.readString()
            r1.zzc = r0
            java.lang.String r0 = r2.readString()
            r1.zzd = r0
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            int r0 = r2.readInt()
            if (r0 == 0) goto L25
            r0 = 1
            goto L26
        L25:
            r0 = 0
        L26:
            r1.zze = r0
            int r2 = r2.readInt()
            r1.zzf = r2
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
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L43
            java.lang.Class<com.google.android.gms.internal.ads.zzagf> r2 = com.google.android.gms.internal.ads.zzagf.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L43
        L10:
            com.google.android.gms.internal.ads.zzagf r5 = (com.google.android.gms.internal.ads.zzagf) r5
            int r2 = r4.zza
            int r3 = r5.zza
            if (r2 != r3) goto L43
            java.lang.String r2 = r4.zzb
            java.lang.String r3 = r5.zzb
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L43
            java.lang.String r2 = r4.zzc
            java.lang.String r3 = r5.zzc
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L43
            java.lang.String r2 = r4.zzd
            java.lang.String r3 = r5.zzd
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L43
            boolean r2 = r4.zze
            boolean r3 = r5.zze
            if (r2 != r3) goto L43
            int r2 = r4.zzf
            int r5 = r5.zzf
            if (r2 != r5) goto L43
            return r0
        L43:
            return r1
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.zzb
            r1 = 0
            if (r0 == 0) goto La
            int r0 = r0.hashCode()
            goto Lb
        La:
            r0 = 0
        Lb:
            int r2 = r4.zza
            java.lang.String r3 = r4.zzc
            if (r3 == 0) goto L16
            int r3 = r3.hashCode()
            goto L17
        L16:
            r3 = 0
        L17:
            int r2 = r2 + 527
            int r2 = r2 * 31
            int r2 = r2 + r0
            java.lang.String r0 = r4.zzd
            if (r0 == 0) goto L24
            int r1 = r0.hashCode()
        L24:
            int r2 = r2 * 31
            int r2 = r2 + r3
            int r2 = r2 * 31
            int r2 = r2 + r1
            int r2 = r2 * 31
            boolean r0 = r4.zze
            int r2 = r2 + r0
            int r2 = r2 * 31
            int r0 = r4.zzf
            int r2 = r2 + r0
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "IcyHeaders: name=\""
            r0.append(r1)
            java.lang.String r1 = r2.zzc
            r0.append(r1)
            java.lang.String r1 = "\", genre=\""
            r0.append(r1)
            java.lang.String r1 = r2.zzb
            r0.append(r1)
            java.lang.String r1 = "\", bitrate="
            r0.append(r1)
            int r1 = r2.zza
            r0.append(r1)
            java.lang.String r1 = ", metadataInterval="
            r0.append(r1)
            int r1 = r2.zzf
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            int r2 = r0.zza
            r1.writeInt(r2)
            java.lang.String r2 = r0.zzb
            r1.writeString(r2)
            java.lang.String r2 = r0.zzc
            r1.writeString(r2)
            java.lang.String r2 = r0.zzd
            r1.writeString(r2)
            int r2 = com.google.android.gms.internal.ads.zzeu.zza
            boolean r2 = r0.zze
            r1.writeInt(r2)
            int r2 = r0.zzf
            r1.writeInt(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbj
    public final void zza(com.google.android.gms.internal.ads.zzbf r2) {
            r1 = this;
            java.lang.String r0 = r1.zzc
            if (r0 == 0) goto L7
            r2.zzp(r0)
        L7:
            java.lang.String r0 = r1.zzb
            if (r0 == 0) goto Le
            r2.zzi(r0)
        Le:
            return
    }
}
