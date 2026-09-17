package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
@java.lang.Deprecated
/* loaded from: classes.dex */
public class zzagd implements com.google.android.gms.internal.ads.zzbj {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzagd> CREATOR = null;
    public final java.lang.String zza;
    public final java.lang.String zzb;

    static {
            com.google.android.gms.internal.ads.zzagc r0 = new com.google.android.gms.internal.ads.zzagc
            r0.<init>()
            com.google.android.gms.internal.ads.zzagd.CREATOR = r0
            return
    }

    protected zzagd(android.os.Parcel r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = r3.readString()
            int r1 = com.google.android.gms.internal.ads.zzeu.zza
            r2.zza = r0
            java.lang.String r3 = r3.readString()
            r2.zzb = r3
            return
    }

    public zzagd(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            java.lang.String r1 = com.google.android.gms.internal.ads.zzfxi.zzb(r1)
            r0.zza = r1
            r0.zzb = r2
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
            if (r5 == 0) goto L29
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L29
        L12:
            com.google.android.gms.internal.ads.zzagd r5 = (com.google.android.gms.internal.ads.zzagd) r5
            java.lang.String r2 = r4.zza
            java.lang.String r3 = r5.zza
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L29
            java.lang.String r2 = r4.zzb
            java.lang.String r5 = r5.zzb
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L29
            return r0
        L29:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.zza
            int r0 = r0.hashCode()
            int r0 = r0 + 527
            java.lang.String r1 = r2.zzb
            int r0 = r0 * 31
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "VC: "
            r0.append(r1)
            java.lang.String r1 = r2.zza
            r0.append(r1)
            java.lang.String r1 = "="
            r0.append(r1)
            java.lang.String r1 = r2.zzb
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.zza
            r1.writeString(r2)
            java.lang.String r2 = r0.zzb
            r1.writeString(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbj
    public final void zza(com.google.android.gms.internal.ads.zzbf r7) {
            r6 = this;
            java.lang.String r0 = r6.zza
            int r1 = r0.hashCode()
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r1) {
                case 62359119: goto L36;
                case 79833656: goto L2c;
                case 428414940: goto L22;
                case 1746739798: goto L18;
                case 1939198791: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L40
        Le:
            java.lang.String r1 = "ARTIST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L40
            r0 = 1
            goto L41
        L18:
            java.lang.String r1 = "ALBUMARTIST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L40
            r0 = 3
            goto L41
        L22:
            java.lang.String r1 = "DESCRIPTION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L40
            r0 = 4
            goto L41
        L2c:
            java.lang.String r1 = "TITLE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L40
            r0 = 0
            goto L41
        L36:
            java.lang.String r1 = "ALBUM"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L40
            r0 = 2
            goto L41
        L40:
            r0 = -1
        L41:
            if (r0 == 0) goto L64
            if (r0 == r5) goto L5e
            if (r0 == r4) goto L58
            if (r0 == r3) goto L52
            if (r0 == r2) goto L4c
            return
        L4c:
            java.lang.String r0 = r6.zzb
            r7.zzh(r0)
            return
        L52:
            java.lang.String r0 = r6.zzb
            r7.zzc(r0)
            return
        L58:
            java.lang.String r0 = r6.zzb
            r7.zzd(r0)
            return
        L5e:
            java.lang.String r0 = r6.zzb
            r7.zze(r0)
            return
        L64:
            java.lang.String r0 = r6.zzb
            r7.zzq(r0)
            return
    }
}
