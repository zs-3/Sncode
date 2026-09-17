package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzagl extends com.google.android.gms.internal.ads.zzagv {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzagl> CREATOR = null;
    public final java.lang.String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    private final com.google.android.gms.internal.ads.zzagv[] zzg;

    static {
            com.google.android.gms.internal.ads.zzagk r0 = new com.google.android.gms.internal.ads.zzagk
            r0.<init>()
            com.google.android.gms.internal.ads.zzagl.CREATOR = r0
            return
    }

    zzagl(android.os.Parcel r5) {
            r4 = this;
            java.lang.String r0 = "CHAP"
            r4.<init>(r0)
            java.lang.String r0 = r5.readString()
            int r1 = com.google.android.gms.internal.ads.zzeu.zza
            r4.zza = r0
            int r0 = r5.readInt()
            r4.zzb = r0
            int r0 = r5.readInt()
            r4.zzc = r0
            long r0 = r5.readLong()
            r4.zzd = r0
            long r0 = r5.readLong()
            r4.zze = r0
            int r0 = r5.readInt()
            com.google.android.gms.internal.ads.zzagv[] r1 = new com.google.android.gms.internal.ads.zzagv[r0]
            r4.zzg = r1
            r1 = 0
        L2e:
            if (r1 >= r0) goto L43
            com.google.android.gms.internal.ads.zzagv[] r2 = r4.zzg
            java.lang.Class<com.google.android.gms.internal.ads.zzagv> r3 = com.google.android.gms.internal.ads.zzagv.class
            java.lang.ClassLoader r3 = r3.getClassLoader()
            android.os.Parcelable r3 = r5.readParcelable(r3)
            com.google.android.gms.internal.ads.zzagv r3 = (com.google.android.gms.internal.ads.zzagv) r3
            r2[r1] = r3
            int r1 = r1 + 1
            goto L2e
        L43:
            return
    }

    public zzagl(java.lang.String r2, int r3, int r4, long r5, long r7, com.google.android.gms.internal.ads.zzagv[] r9) {
            r1 = this;
            java.lang.String r0 = "CHAP"
            r1.<init>(r0)
            r1.zza = r2
            r1.zzb = r3
            r1.zzc = r4
            r1.zzd = r5
            r1.zze = r7
            r1.zzg = r9
            return
    }

    @Override // com.google.android.gms.internal.ads.zzagv, android.os.Parcelable
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
            if (r8 == 0) goto L43
            java.lang.Class<com.google.android.gms.internal.ads.zzagl> r2 = com.google.android.gms.internal.ads.zzagl.class
            java.lang.Class r3 = r8.getClass()
            if (r2 == r3) goto L10
            goto L43
        L10:
            com.google.android.gms.internal.ads.zzagl r8 = (com.google.android.gms.internal.ads.zzagl) r8
            int r2 = r7.zzb
            int r3 = r8.zzb
            if (r2 != r3) goto L43
            int r2 = r7.zzc
            int r3 = r8.zzc
            if (r2 != r3) goto L43
            long r2 = r7.zzd
            long r4 = r8.zzd
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L43
            long r2 = r7.zze
            long r4 = r8.zze
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L43
            java.lang.String r2 = r7.zza
            java.lang.String r3 = r8.zza
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L43
            com.google.android.gms.internal.ads.zzagv[] r2 = r7.zzg
            com.google.android.gms.internal.ads.zzagv[] r8 = r8.zzg
            boolean r8 = java.util.Arrays.equals(r2, r8)
            if (r8 == 0) goto L43
            return r0
        L43:
            return r1
    }

    public final int hashCode() {
            r7 = this;
            java.lang.String r0 = r7.zza
            if (r0 == 0) goto L9
            int r0 = r0.hashCode()
            goto La
        L9:
            r0 = 0
        La:
            int r1 = r7.zzb
            int r2 = r7.zzc
            long r3 = r7.zzd
            long r5 = r7.zze
            int r1 = r1 + 527
            int r1 = r1 * 31
            int r1 = r1 + r2
            int r1 = r1 * 31
            int r2 = (int) r3
            int r1 = r1 + r2
            int r1 = r1 * 31
            int r2 = (int) r5
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
            int r6 = r4.zzb
            r5.writeInt(r6)
            int r6 = r4.zzc
            r5.writeInt(r6)
            long r0 = r4.zzd
            r5.writeLong(r0)
            long r0 = r4.zze
            r5.writeLong(r0)
            com.google.android.gms.internal.ads.zzagv[] r6 = r4.zzg
            int r6 = r6.length
            r5.writeInt(r6)
            com.google.android.gms.internal.ads.zzagv[] r6 = r4.zzg
            int r0 = r6.length
            r1 = 0
            r2 = 0
        L24:
            if (r2 >= r0) goto L2e
            r3 = r6[r2]
            r5.writeParcelable(r3, r1)
            int r2 = r2 + 1
            goto L24
        L2e:
            return
    }
}
