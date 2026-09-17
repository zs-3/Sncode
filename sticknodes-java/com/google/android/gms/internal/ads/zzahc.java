package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzahc extends com.google.android.gms.internal.ads.zzagv {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzahc> CREATOR = null;
    public final java.lang.String zza;
    public final byte[] zzb;

    static {
            com.google.android.gms.internal.ads.zzahb r0 = new com.google.android.gms.internal.ads.zzahb
            r0.<init>()
            com.google.android.gms.internal.ads.zzahc.CREATOR = r0
            return
    }

    zzahc(android.os.Parcel r3) {
            r2 = this;
            java.lang.String r0 = "PRIV"
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            int r1 = com.google.android.gms.internal.ads.zzeu.zza
            r2.zza = r0
            byte[] r3 = r3.createByteArray()
            r2.zzb = r3
            return
    }

    public zzahc(java.lang.String r2, byte[] r3) {
            r1 = this;
            java.lang.String r0 = "PRIV"
            r1.<init>(r0)
            r1.zza = r2
            r1.zzb = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L27
            java.lang.Class<com.google.android.gms.internal.ads.zzahc> r2 = com.google.android.gms.internal.ads.zzahc.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L27
        L10:
            com.google.android.gms.internal.ads.zzahc r5 = (com.google.android.gms.internal.ads.zzahc) r5
            java.lang.String r2 = r4.zza
            java.lang.String r3 = r5.zza
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L27
            byte[] r2 = r4.zzb
            byte[] r5 = r5.zzb
            boolean r5 = java.util.Arrays.equals(r2, r5)
            if (r5 == 0) goto L27
            return r0
        L27:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.zza
            if (r0 == 0) goto L9
            int r0 = r0.hashCode()
            goto La
        L9:
            r0 = 0
        La:
            byte[] r1 = r2.zzb
            int r0 = r0 + 527
            int r0 = r0 * 31
            int r1 = java.util.Arrays.hashCode(r1)
            int r0 = r0 + r1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzagv
    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.zzf
            r0.append(r1)
            java.lang.String r1 = ": owner="
            r0.append(r1)
            java.lang.String r1 = r2.zza
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.zza
            r1.writeString(r2)
            byte[] r2 = r0.zzb
            r1.writeByteArray(r2)
            return
    }
}
