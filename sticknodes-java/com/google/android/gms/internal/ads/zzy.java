package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzy implements java.util.Comparator<com.google.android.gms.internal.ads.zzx>, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzy> CREATOR = null;
    public final java.lang.String zza;
    public final int zzb;
    private final com.google.android.gms.internal.ads.zzx[] zzc;
    private int zzd;

    static {
            com.google.android.gms.internal.ads.zzv r0 = new com.google.android.gms.internal.ads.zzv
            r0.<init>()
            com.google.android.gms.internal.ads.zzy.CREATOR = r0
            return
    }

    zzy(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = r2.readString()
            r1.zza = r0
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzx> r0 = com.google.android.gms.internal.ads.zzx.CREATOR
            java.lang.Object[] r2 = r2.createTypedArray(r0)
            com.google.android.gms.internal.ads.zzx[] r2 = (com.google.android.gms.internal.ads.zzx[]) r2
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            r1.zzc = r2
            int r2 = r2.length
            r1.zzb = r2
            return
    }

    private zzy(java.lang.String r1, boolean r2, com.google.android.gms.internal.ads.zzx... r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            if (r2 == 0) goto Le
            java.lang.Object r1 = r3.clone()
            r3 = r1
            com.google.android.gms.internal.ads.zzx[] r3 = (com.google.android.gms.internal.ads.zzx[]) r3
        Le:
            r0.zzc = r3
            int r1 = r3.length
            r0.zzb = r1
            java.util.Arrays.sort(r3, r0)
            return
    }

    public zzy(java.lang.String r2, com.google.android.gms.internal.ads.zzx... r3) {
            r1 = this;
            r2 = 0
            r0 = 1
            r1.<init>(r2, r0, r3)
            return
    }

    public zzy(java.util.List r3) {
            r2 = this;
            r0 = 0
            com.google.android.gms.internal.ads.zzx[] r1 = new com.google.android.gms.internal.ads.zzx[r0]
            java.lang.Object[] r3 = r3.toArray(r1)
            com.google.android.gms.internal.ads.zzx[] r3 = (com.google.android.gms.internal.ads.zzx[]) r3
            r1 = 0
            r2.<init>(r1, r0, r3)
            return
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(com.google.android.gms.internal.ads.zzx r3, com.google.android.gms.internal.ads.zzx r4) {
            r2 = this;
            com.google.android.gms.internal.ads.zzx r3 = (com.google.android.gms.internal.ads.zzx) r3
            com.google.android.gms.internal.ads.zzx r4 = (com.google.android.gms.internal.ads.zzx) r4
            java.util.UUID r0 = com.google.android.gms.internal.ads.zzk.zza
            java.util.UUID r1 = r3.zza
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L1a
            java.util.UUID r3 = r4.zza
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L18
            r3 = 1
            goto L22
        L18:
            r3 = 0
            return r3
        L1a:
            java.util.UUID r3 = r3.zza
            java.util.UUID r4 = r4.zza
            int r3 = r3.compareTo(r4)
        L22:
            return r3
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.Comparator
    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L27
            java.lang.Class<com.google.android.gms.internal.ads.zzy> r2 = com.google.android.gms.internal.ads.zzy.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L27
        L10:
            com.google.android.gms.internal.ads.zzy r5 = (com.google.android.gms.internal.ads.zzy) r5
            java.lang.String r2 = r4.zza
            java.lang.String r3 = r5.zza
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L27
            com.google.android.gms.internal.ads.zzx[] r2 = r4.zzc
            com.google.android.gms.internal.ads.zzx[] r5 = r5.zzc
            boolean r5 = java.util.Arrays.equals(r2, r5)
            if (r5 == 0) goto L27
            return r0
        L27:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.zzd
            if (r0 != 0) goto L19
            java.lang.String r0 = r2.zza
            if (r0 != 0) goto La
            r0 = 0
            goto Le
        La:
            int r0 = r0.hashCode()
        Le:
            com.google.android.gms.internal.ads.zzx[] r1 = r2.zzc
            int r0 = r0 * 31
            int r1 = java.util.Arrays.hashCode(r1)
            int r0 = r0 + r1
            r2.zzd = r0
        L19:
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            java.lang.String r3 = r1.zza
            r2.writeString(r3)
            com.google.android.gms.internal.ads.zzx[] r3 = r1.zzc
            r0 = 0
            r2.writeTypedArray(r3, r0)
            return
    }

    public final com.google.android.gms.internal.ads.zzx zza(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzx[] r0 = r1.zzc
            r2 = r0[r2]
            return r2
    }

    public final com.google.android.gms.internal.ads.zzy zzb(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = r3.zza
            boolean r0 = java.util.Objects.equals(r0, r4)
            if (r0 == 0) goto L9
            return r3
        L9:
            com.google.android.gms.internal.ads.zzx[] r0 = r3.zzc
            com.google.android.gms.internal.ads.zzy r1 = new com.google.android.gms.internal.ads.zzy
            r2 = 0
            r1.<init>(r4, r2, r0)
            return r1
    }
}
