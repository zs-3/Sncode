package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaha extends com.google.android.gms.internal.ads.zzagv {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzaha> CREATOR = null;
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int[] zzd;
    public final int[] zze;

    static {
            com.google.android.gms.internal.ads.zzagz r0 = new com.google.android.gms.internal.ads.zzagz
            r0.<init>()
            com.google.android.gms.internal.ads.zzaha.CREATOR = r0
            return
    }

    public zzaha(int r2, int r3, int r4, int[] r5, int[] r6) {
            r1 = this;
            java.lang.String r0 = "MLLT"
            r1.<init>(r0)
            r1.zza = r2
            r1.zzb = r3
            r1.zzc = r4
            r1.zzd = r5
            r1.zze = r6
            return
    }

    zzaha(android.os.Parcel r3) {
            r2 = this;
            java.lang.String r0 = "MLLT"
            r2.<init>(r0)
            int r0 = r3.readInt()
            r2.zza = r0
            int r0 = r3.readInt()
            r2.zzb = r0
            int r0 = r3.readInt()
            r2.zzc = r0
            int[] r0 = r3.createIntArray()
            int r1 = com.google.android.gms.internal.ads.zzeu.zza
            r2.zzd = r0
            int[] r3 = r3.createIntArray()
            r2.zze = r3
            return
    }

    @Override // com.google.android.gms.internal.ads.zzagv, android.os.Parcelable
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
            if (r5 == 0) goto L39
            java.lang.Class<com.google.android.gms.internal.ads.zzaha> r2 = com.google.android.gms.internal.ads.zzaha.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L39
        L10:
            com.google.android.gms.internal.ads.zzaha r5 = (com.google.android.gms.internal.ads.zzaha) r5
            int r2 = r4.zza
            int r3 = r5.zza
            if (r2 != r3) goto L39
            int r2 = r4.zzb
            int r3 = r5.zzb
            if (r2 != r3) goto L39
            int r2 = r4.zzc
            int r3 = r5.zzc
            if (r2 != r3) goto L39
            int[] r2 = r4.zzd
            int[] r3 = r5.zzd
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 == 0) goto L39
            int[] r2 = r4.zze
            int[] r5 = r5.zze
            boolean r5 = java.util.Arrays.equals(r2, r5)
            if (r5 == 0) goto L39
            return r0
        L39:
            return r1
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.zza
            int r0 = r0 + 527
            int[] r1 = r3.zzd
            int r0 = r0 * 31
            int r2 = r3.zzb
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r2 = r3.zzc
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r1 = java.util.Arrays.hashCode(r1)
            int r0 = r0 + r1
            int[] r1 = r3.zze
            int r0 = r0 * 31
            int r1 = java.util.Arrays.hashCode(r1)
            int r0 = r0 + r1
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            int r2 = r0.zza
            r1.writeInt(r2)
            int r2 = r0.zzb
            r1.writeInt(r2)
            int r2 = r0.zzc
            r1.writeInt(r2)
            int[] r2 = r0.zzd
            r1.writeIntArray(r2)
            int[] r2 = r0.zze
            r1.writeIntArray(r2)
            return
    }
}
