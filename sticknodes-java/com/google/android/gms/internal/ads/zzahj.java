package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzahj implements com.google.android.gms.internal.ads.zzbj {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzahj> CREATOR = null;
    public final long zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;

    static {
            com.google.android.gms.internal.ads.zzahh r0 = new com.google.android.gms.internal.ads.zzahh
            r0.<init>()
            com.google.android.gms.internal.ads.zzahj.CREATOR = r0
            return
    }

    public zzahj(long r1, long r3, long r5, long r7, long r9) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r3
            r0.zzc = r5
            r0.zzd = r7
            r0.zze = r9
            return
    }

    /* synthetic */ zzahj(android.os.Parcel r3, com.google.android.gms.internal.ads.zzahi r4) {
            r2 = this;
            r2.<init>()
            long r0 = r3.readLong()
            r2.zza = r0
            long r0 = r3.readLong()
            r2.zzb = r0
            long r0 = r3.readLong()
            r2.zzc = r0
            long r0 = r3.readLong()
            r2.zzd = r0
            long r3 = r3.readLong()
            r2.zze = r3
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
            if (r8 == 0) goto L3b
            java.lang.Class<com.google.android.gms.internal.ads.zzahj> r2 = com.google.android.gms.internal.ads.zzahj.class
            java.lang.Class r3 = r8.getClass()
            if (r2 == r3) goto L10
            goto L3b
        L10:
            com.google.android.gms.internal.ads.zzahj r8 = (com.google.android.gms.internal.ads.zzahj) r8
            long r2 = r7.zza
            long r4 = r8.zza
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L3b
            long r2 = r7.zzb
            long r4 = r8.zzb
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L3b
            long r2 = r7.zzc
            long r4 = r8.zzc
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L3b
            long r2 = r7.zzd
            long r4 = r8.zzd
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L3b
            long r2 = r7.zze
            long r4 = r8.zze
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 != 0) goto L3b
            return r0
        L3b:
            return r1
    }

    public final int hashCode() {
            r13 = this;
            long r0 = r13.zza
            r2 = 32
            long r3 = r0 >>> r2
            long r0 = r0 ^ r3
            int r1 = (int) r0
            long r3 = r13.zze
            long r5 = r13.zzd
            long r7 = r13.zzc
            long r9 = r13.zzb
            int r1 = r1 + 527
            long r11 = r3 >>> r2
            long r3 = r3 ^ r11
            long r11 = r5 >>> r2
            long r5 = r5 ^ r11
            long r11 = r7 >>> r2
            long r7 = r7 ^ r11
            long r11 = r9 >>> r2
            long r9 = r9 ^ r11
            int r1 = r1 * 31
            int r0 = (int) r9
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = (int) r7
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = (int) r5
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = (int) r3
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Motion photo metadata: photoStartPosition="
            r0.append(r1)
            long r1 = r3.zza
            r0.append(r1)
            java.lang.String r1 = ", photoSize="
            r0.append(r1)
            long r1 = r3.zzb
            r0.append(r1)
            java.lang.String r1 = ", photoPresentationTimestampUs="
            r0.append(r1)
            long r1 = r3.zzc
            r0.append(r1)
            java.lang.String r1 = ", videoStartPosition="
            r0.append(r1)
            long r1 = r3.zzd
            r0.append(r1)
            java.lang.String r1 = ", videoSize="
            r0.append(r1)
            long r1 = r3.zze
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            long r0 = r2.zza
            r3.writeLong(r0)
            long r0 = r2.zzb
            r3.writeLong(r0)
            long r0 = r2.zzc
            r3.writeLong(r0)
            long r0 = r2.zzd
            r3.writeLong(r0)
            long r0 = r2.zze
            r3.writeLong(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbj
    public final /* synthetic */ void zza(com.google.android.gms.internal.ads.zzbf r1) {
            r0 = this;
            return
    }
}
