package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzafy implements com.google.android.gms.internal.ads.zzbj {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzafy> CREATOR = null;
    public final java.lang.String zza;
    public final java.lang.String zzb;
    public final long zzc;
    public final long zzd;
    public final byte[] zze;
    private int zzf;

    static {
            com.google.android.gms.internal.ads.zzad r0 = new com.google.android.gms.internal.ads.zzad
            r0.<init>()
            java.lang.String r1 = "application/id3"
            r0.zzZ(r1)
            r0.zzaf()
            com.google.android.gms.internal.ads.zzad r0 = new com.google.android.gms.internal.ads.zzad
            r0.<init>()
            java.lang.String r1 = "application/x-scte35"
            r0.zzZ(r1)
            r0.zzaf()
            com.google.android.gms.internal.ads.zzafx r0 = new com.google.android.gms.internal.ads.zzafx
            r0.<init>()
            com.google.android.gms.internal.ads.zzafy.CREATOR = r0
            return
    }

    zzafy(android.os.Parcel r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = r3.readString()
            int r1 = com.google.android.gms.internal.ads.zzeu.zza
            r2.zza = r0
            java.lang.String r0 = r3.readString()
            r2.zzb = r0
            long r0 = r3.readLong()
            r2.zzc = r0
            long r0 = r3.readLong()
            r2.zzd = r0
            byte[] r3 = r3.createByteArray()
            r2.zze = r3
            return
    }

    public zzafy(java.lang.String r1, java.lang.String r2, long r3, long r5, byte[] r7) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r5
            r0.zze = r7
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 == 0) goto L41
            java.lang.Class<com.google.android.gms.internal.ads.zzafy> r2 = com.google.android.gms.internal.ads.zzafy.class
            java.lang.Class r3 = r8.getClass()
            if (r2 == r3) goto L10
            goto L41
        L10:
            com.google.android.gms.internal.ads.zzafy r8 = (com.google.android.gms.internal.ads.zzafy) r8
            long r2 = r7.zzc
            long r4 = r8.zzc
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L41
            long r2 = r7.zzd
            long r4 = r8.zzd
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L41
            java.lang.String r2 = r7.zza
            java.lang.String r3 = r8.zza
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L41
            java.lang.String r2 = r7.zzb
            java.lang.String r3 = r8.zzb
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L41
            byte[] r2 = r7.zze
            byte[] r8 = r8.zze
            boolean r8 = java.util.Arrays.equals(r2, r8)
            if (r8 == 0) goto L41
            return r0
        L41:
            return r1
    }

    public final int hashCode() {
            r10 = this;
            int r0 = r10.zzf
            if (r0 != 0) goto L3b
            java.lang.String r0 = r10.zza
            r1 = 0
            if (r0 == 0) goto Le
            int r0 = r0.hashCode()
            goto Lf
        Le:
            r0 = 0
        Lf:
            java.lang.String r2 = r10.zzb
            if (r2 == 0) goto L17
            int r1 = r2.hashCode()
        L17:
            int r0 = r0 + 527
            long r2 = r10.zzc
            long r4 = r10.zzd
            byte[] r6 = r10.zze
            r7 = 32
            long r8 = r4 >>> r7
            long r4 = r4 ^ r8
            long r7 = r2 >>> r7
            long r2 = r2 ^ r7
            int r0 = r0 * 31
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = (int) r2
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = (int) r4
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = java.util.Arrays.hashCode(r6)
            int r0 = r0 + r1
            r10.zzf = r0
        L3b:
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "EMSG: scheme="
            r0.append(r1)
            java.lang.String r1 = r3.zza
            r0.append(r1)
            java.lang.String r1 = ", id="
            r0.append(r1)
            long r1 = r3.zzd
            r0.append(r1)
            java.lang.String r1 = ", durationMs="
            r0.append(r1)
            long r1 = r3.zzc
            r0.append(r1)
            java.lang.String r1 = ", value="
            r0.append(r1)
            java.lang.String r1 = r3.zzb
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            java.lang.String r4 = r2.zza
            r3.writeString(r4)
            java.lang.String r4 = r2.zzb
            r3.writeString(r4)
            long r0 = r2.zzc
            r3.writeLong(r0)
            long r0 = r2.zzd
            r3.writeLong(r0)
            byte[] r4 = r2.zze
            r3.writeByteArray(r4)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbj
    public final /* synthetic */ void zza(com.google.android.gms.internal.ads.zzbf r1) {
            r0 = this;
            return
    }
}
