package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfe implements com.google.android.gms.internal.ads.zzbj {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzfe> CREATOR = null;
    public final long zza;
    public final long zzb;
    public final long zzc;

    static {
            com.google.android.gms.internal.ads.zzfc r0 = new com.google.android.gms.internal.ads.zzfc
            r0.<init>()
            com.google.android.gms.internal.ads.zzfe.CREATOR = r0
            return
    }

    public zzfe(long r1, long r3, long r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r3
            r0.zzc = r5
            return
    }

    /* synthetic */ zzfe(android.os.Parcel r3, com.google.android.gms.internal.ads.zzfd r4) {
            r2 = this;
            r2.<init>()
            long r0 = r3.readLong()
            r2.zza = r0
            long r0 = r3.readLong()
            r2.zzb = r0
            long r3 = r3.readLong()
            r2.zzc = r3
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
            boolean r1 = r8 instanceof com.google.android.gms.internal.ads.zzfe
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.internal.ads.zzfe r8 = (com.google.android.gms.internal.ads.zzfe) r8
            long r3 = r7.zza
            long r5 = r8.zza
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L25
            long r3 = r7.zzb
            long r5 = r8.zzb
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L25
            long r3 = r7.zzc
            long r5 = r8.zzc
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L25
            return r0
        L25:
            return r2
    }

    public final int hashCode() {
            r9 = this;
            long r0 = r9.zza
            r2 = 32
            long r3 = r0 >>> r2
            long r0 = r0 ^ r3
            int r1 = (int) r0
            long r3 = r9.zzc
            long r5 = r9.zzb
            int r1 = r1 + 527
            long r7 = r3 >>> r2
            long r3 = r3 ^ r7
            long r7 = r5 >>> r2
            long r5 = r5 ^ r7
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
            java.lang.String r1 = "Mp4Timestamp: creation time="
            r0.append(r1)
            long r1 = r3.zza
            r0.append(r1)
            java.lang.String r1 = ", modification time="
            r0.append(r1)
            long r1 = r3.zzb
            r0.append(r1)
            java.lang.String r1 = ", timescale="
            r0.append(r1)
            long r1 = r3.zzc
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
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbj
    public final /* synthetic */ void zza(com.google.android.gms.internal.ads.zzbf r1) {
            r0 = this;
            return
    }
}
