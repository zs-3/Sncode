package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzahm implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzahm> CREATOR = null;
    public final long zza;
    public final long zzb;
    public final int zzc;

    static {
            com.google.android.gms.internal.ads.zzahl r0 = new com.google.android.gms.internal.ads.zzahl
            r0.<init>()
            com.google.android.gms.internal.ads.zzahm.CREATOR = r0
            return
    }

    public zzahm(long r2, long r4, int r6) {
            r1 = this;
            r1.<init>()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            com.google.android.gms.internal.ads.zzdi.zzd(r0)
            r1.zza = r2
            r1.zzb = r4
            r1.zzc = r6
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
            if (r8 == 0) goto L29
            java.lang.Class<com.google.android.gms.internal.ads.zzahm> r2 = com.google.android.gms.internal.ads.zzahm.class
            java.lang.Class r3 = r8.getClass()
            if (r2 == r3) goto L10
            goto L29
        L10:
            com.google.android.gms.internal.ads.zzahm r8 = (com.google.android.gms.internal.ads.zzahm) r8
            long r2 = r7.zza
            long r4 = r8.zza
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L29
            long r2 = r7.zzb
            long r4 = r8.zzb
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L29
            int r2 = r7.zzc
            int r8 = r8.zzc
            if (r2 != r8) goto L29
            return r0
        L29:
            return r1
    }

    public final int hashCode() {
            r3 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            long r1 = r3.zza
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            long r1 = r3.zzb
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            int r1 = r3.zzc
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            long r1 = r3.zza
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            long r1 = r3.zzb
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            int r1 = r3.zzc
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r2 = "Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d"
            java.lang.String r0 = java.lang.String.format(r1, r2, r0)
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            long r0 = r2.zza
            r3.writeLong(r0)
            long r0 = r2.zzb
            r3.writeLong(r0)
            int r4 = r2.zzc
            r3.writeInt(r4)
            return
    }
}
