package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzey implements com.google.android.gms.internal.ads.zzbj {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzey> CREATOR = null;
    public final java.lang.String zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    static {
            com.google.android.gms.internal.ads.zzew r0 = new com.google.android.gms.internal.ads.zzew
            r0.<init>()
            com.google.android.gms.internal.ads.zzey.CREATOR = r0
            return
    }

    /* synthetic */ zzey(android.os.Parcel r3, com.google.android.gms.internal.ads.zzex r4) {
            r2 = this;
            r2.<init>()
            java.lang.String r4 = r3.readString()
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            r2.zza = r4
            byte[] r0 = r3.createByteArray()
            r2.zzb = r0
            int r1 = r3.readInt()
            r2.zzc = r1
            int r3 = r3.readInt()
            r2.zzd = r3
            zzb(r4, r0, r3)
            return
    }

    public zzey(java.lang.String r1, byte[] r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            zzb(r1, r2, r4)
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    private static void zzb(java.lang.String r6, byte[] r7, int r8) {
            int r0 = r6.hashCode()
            r1 = 3
            r2 = 2
            r3 = 4
            r4 = 1
            r5 = 0
            switch(r0) {
                case -1949883051: goto L35;
                case -1555642602: goto L2b;
                case 101820674: goto L21;
                case 188404399: goto L17;
                case 1805012160: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L3f
        Ld:
            java.lang.String r0 = "editable.tracks.map"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L3f
            r6 = 3
            goto L40
        L17:
            java.lang.String r0 = "editable.tracks.offset"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L3f
            r6 = 1
            goto L40
        L21:
            java.lang.String r0 = "editable.tracks.length"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L3f
            r6 = 2
            goto L40
        L2b:
            java.lang.String r0 = "editable.tracks.samples.location"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L3f
            r6 = 4
            goto L40
        L35:
            java.lang.String r0 = "com.android.capture.fps"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L3f
            r6 = 0
            goto L40
        L3f:
            r6 = -1
        L40:
            if (r6 == 0) goto L75
            if (r6 == r4) goto L66
            if (r6 == r2) goto L66
            if (r6 == r1) goto L5e
            if (r6 == r3) goto L4b
            return
        L4b:
            r6 = 75
            if (r8 != r6) goto L59
            int r6 = r7.length
            if (r6 != r4) goto L59
            r6 = r7[r5]
            if (r6 == 0) goto L5a
            if (r6 != r4) goto L59
            goto L5a
        L59:
            r4 = 0
        L5a:
            com.google.android.gms.internal.ads.zzdi.zzd(r4)
            return
        L5e:
            if (r8 != 0) goto L61
            goto L62
        L61:
            r4 = 0
        L62:
            com.google.android.gms.internal.ads.zzdi.zzd(r4)
            return
        L66:
            r6 = 78
            if (r8 != r6) goto L70
            int r6 = r7.length
            r7 = 8
            if (r6 != r7) goto L70
            goto L71
        L70:
            r4 = 0
        L71:
            com.google.android.gms.internal.ads.zzdi.zzd(r4)
            return
        L75:
            r6 = 23
            if (r8 != r6) goto L7d
            int r6 = r7.length
            if (r6 != r3) goto L7d
            goto L7e
        L7d:
            r4 = 0
        L7e:
            com.google.android.gms.internal.ads.zzdi.zzd(r4)
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
            if (r5 == 0) goto L33
            java.lang.Class<com.google.android.gms.internal.ads.zzey> r2 = com.google.android.gms.internal.ads.zzey.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L33
        L10:
            com.google.android.gms.internal.ads.zzey r5 = (com.google.android.gms.internal.ads.zzey) r5
            java.lang.String r2 = r4.zza
            java.lang.String r3 = r5.zza
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L33
            byte[] r2 = r4.zzb
            byte[] r3 = r5.zzb
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 == 0) goto L33
            int r2 = r4.zzc
            int r3 = r5.zzc
            if (r2 != r3) goto L33
            int r2 = r4.zzd
            int r5 = r5.zzd
            if (r2 != r5) goto L33
            return r0
        L33:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.zza
            int r0 = r0.hashCode()
            int r0 = r0 + 527
            byte[] r1 = r2.zzb
            int r0 = r0 * 31
            int r1 = java.util.Arrays.hashCode(r1)
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.zzc
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.zzd
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r6 = this;
            int r0 = r6.zzd
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L59
            if (r0 == r2) goto L52
            r2 = 23
            if (r0 == r2) goto L43
            r2 = 67
            if (r0 == r2) goto L37
            r2 = 75
            if (r0 == r2) goto L2b
            r2 = 78
            if (r0 == r2) goto L1a
            goto L90
        L1a:
            byte[] r0 = r6.zzb
            com.google.android.gms.internal.ads.zzek r1 = new com.google.android.gms.internal.ads.zzek
            r1.<init>(r0)
            long r0 = r1.zzw()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Lbd
        L2b:
            byte[] r0 = r6.zzb
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Lbd
        L37:
            byte[] r0 = r6.zzb
            int r0 = com.google.android.gms.internal.ads.zzgdu.zzd(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Lbd
        L43:
            byte[] r0 = r6.zzb
            int r0 = com.google.android.gms.internal.ads.zzgdu.zzd(r0)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Lbd
        L52:
            byte[] r0 = r6.zzb
            java.lang.String r0 = com.google.android.gms.internal.ads.zzeu.zzA(r0)
            goto Lbd
        L59:
            java.lang.String r0 = r6.zza
            java.lang.String r3 = "editable.tracks.map"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L90
            byte[] r0 = r6.zzb
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "track types = "
            r3.append(r4)
            r2 = r0[r2]
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L76:
            if (r1 >= r2) goto L86
            int r5 = r1 + 2
            r5 = r0[r5]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.add(r5)
            int r1 = r1 + 1
            goto L76
        L86:
            java.lang.String r0 = ","
            com.google.android.gms.internal.ads.zzfxr.zzb(r3, r4, r0)
            java.lang.String r0 = r3.toString()
            goto Lbd
        L90:
            byte[] r0 = r6.zzb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r3 = r0.length
            int r3 = r3 + r3
            r2.<init>(r3)
        L99:
            int r3 = r0.length
            if (r1 >= r3) goto Lb9
            r3 = r0[r1]
            int r3 = r3 >> 4
            r3 = r3 & 15
            r4 = 16
            char r3 = java.lang.Character.forDigit(r3, r4)
            r2.append(r3)
            r3 = r0[r1]
            r3 = r3 & 15
            char r3 = java.lang.Character.forDigit(r3, r4)
            r2.append(r3)
            int r1 = r1 + 1
            goto L99
        Lb9:
            java.lang.String r0 = r2.toString()
        Lbd:
            java.lang.String r1 = r6.zza
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "mdta: key="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = ", value="
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.zza
            r1.writeString(r2)
            byte[] r2 = r0.zzb
            r1.writeByteArray(r2)
            int r2 = r0.zzc
            r1.writeInt(r2)
            int r2 = r0.zzd
            r1.writeInt(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbj
    public final /* synthetic */ void zza(com.google.android.gms.internal.ads.zzbf r1) {
            r0 = this;
            return
    }
}
