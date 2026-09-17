package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzahn implements com.google.android.gms.internal.ads.zzbj {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzahn> CREATOR = null;
    public final java.util.List zza;

    static {
            com.google.android.gms.internal.ads.zzahk r0 = new com.google.android.gms.internal.ads.zzahk
            r0.<init>()
            com.google.android.gms.internal.ads.zzahn.CREATOR = r0
            return
    }

    public zzahn(java.util.List r9) {
            r8 = this;
            r8.<init>()
            r8.zza = r9
            boolean r0 = r9.isEmpty()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Le
            goto L36
        Le:
            java.lang.Object r0 = r9.get(r1)
            com.google.android.gms.internal.ads.zzahm r0 = (com.google.android.gms.internal.ads.zzahm) r0
            long r3 = r0.zzb
            r0 = 1
        L17:
            int r5 = r9.size()
            if (r0 >= r5) goto L36
            java.lang.Object r5 = r9.get(r0)
            com.google.android.gms.internal.ads.zzahm r5 = (com.google.android.gms.internal.ads.zzahm) r5
            long r5 = r5.zza
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 >= 0) goto L2b
            r1 = 1
            goto L36
        L2b:
            java.lang.Object r3 = r9.get(r0)
            com.google.android.gms.internal.ads.zzahm r3 = (com.google.android.gms.internal.ads.zzahm) r3
            long r3 = r3.zzb
            int r0 = r0 + 1
            goto L17
        L36:
            r9 = r1 ^ 1
            com.google.android.gms.internal.ads.zzdi.zzd(r9)
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L1a
            java.lang.Class<com.google.android.gms.internal.ads.zzahn> r0 = com.google.android.gms.internal.ads.zzahn.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Lf
            goto L1a
        Lf:
            com.google.android.gms.internal.ads.zzahn r3 = (com.google.android.gms.internal.ads.zzahn) r3
            java.util.List r0 = r2.zza
            java.util.List r3 = r3.zza
            boolean r3 = r0.equals(r3)
            return r3
        L1a:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r1 = this;
            java.util.List r0 = r1.zza
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.util.List r0 = r2.zza
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "SlowMotion: segments="
            java.lang.String r0 = r1.concat(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.util.List r2 = r0.zza
            r1.writeList(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbj
    public final /* synthetic */ void zza(com.google.android.gms.internal.ads.zzbf r1) {
            r0 = this;
            return
    }
}
