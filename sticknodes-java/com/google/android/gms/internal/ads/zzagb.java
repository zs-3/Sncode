package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzagb implements com.google.android.gms.internal.ads.zzbj {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzagb> CREATOR = null;
    public final int zza;
    public final java.lang.String zzb;
    public final java.lang.String zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final byte[] zzh;

    static {
            com.google.android.gms.internal.ads.zzaga r0 = new com.google.android.gms.internal.ads.zzaga
            r0.<init>()
            com.google.android.gms.internal.ads.zzagb.CREATOR = r0
            return
    }

    public zzagb(int r1, java.lang.String r2, java.lang.String r3, int r4, int r5, int r6, int r7, byte[] r8) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r6
            r0.zzg = r7
            r0.zzh = r8
            return
    }

    zzagb(android.os.Parcel r3) {
            r2 = this;
            r2.<init>()
            int r0 = r3.readInt()
            r2.zza = r0
            java.lang.String r0 = r3.readString()
            int r1 = com.google.android.gms.internal.ads.zzeu.zza
            r2.zzb = r0
            java.lang.String r0 = r3.readString()
            r2.zzc = r0
            int r0 = r3.readInt()
            r2.zzd = r0
            int r0 = r3.readInt()
            r2.zze = r0
            int r0 = r3.readInt()
            r2.zzf = r0
            int r0 = r3.readInt()
            r2.zzg = r0
            byte[] r3 = r3.createByteArray()
            r2.zzh = r3
            return
    }

    public static com.google.android.gms.internal.ads.zzagb zzb(com.google.android.gms.internal.ads.zzek r10) {
            int r1 = r10.zzg()
            int r0 = r10.zzg()
            java.nio.charset.Charset r2 = com.google.android.gms.internal.ads.zzfxo.zza
            java.lang.String r0 = r10.zzB(r0, r2)
            java.lang.String r2 = com.google.android.gms.internal.ads.zzbn.zze(r0)
            int r0 = r10.zzg()
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r3 = r10.zzB(r0, r3)
            int r4 = r10.zzg()
            int r5 = r10.zzg()
            int r6 = r10.zzg()
            int r7 = r10.zzg()
            int r0 = r10.zzg()
            byte[] r8 = new byte[r0]
            r9 = 0
            r10.zzH(r8, r9, r0)
            com.google.android.gms.internal.ads.zzagb r10 = new com.google.android.gms.internal.ads.zzagb
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
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
            if (r5 == 0) goto L4f
            java.lang.Class<com.google.android.gms.internal.ads.zzagb> r2 = com.google.android.gms.internal.ads.zzagb.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L4f
        L10:
            com.google.android.gms.internal.ads.zzagb r5 = (com.google.android.gms.internal.ads.zzagb) r5
            int r2 = r4.zza
            int r3 = r5.zza
            if (r2 != r3) goto L4f
            java.lang.String r2 = r4.zzb
            java.lang.String r3 = r5.zzb
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L4f
            java.lang.String r2 = r4.zzc
            java.lang.String r3 = r5.zzc
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L4f
            int r2 = r4.zzd
            int r3 = r5.zzd
            if (r2 != r3) goto L4f
            int r2 = r4.zze
            int r3 = r5.zze
            if (r2 != r3) goto L4f
            int r2 = r4.zzf
            int r3 = r5.zzf
            if (r2 != r3) goto L4f
            int r2 = r4.zzg
            int r3 = r5.zzg
            if (r2 != r3) goto L4f
            byte[] r2 = r4.zzh
            byte[] r5 = r5.zzh
            boolean r5 = java.util.Arrays.equals(r2, r5)
            if (r5 == 0) goto L4f
            return r0
        L4f:
            return r1
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.zza
            int r0 = r0 + 527
            java.lang.String r1 = r3.zzb
            int r0 = r0 * 31
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            java.lang.String r1 = r3.zzc
            int r0 = r0 * 31
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            byte[] r1 = r3.zzh
            int r0 = r0 * 31
            int r2 = r3.zzd
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r2 = r3.zze
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r2 = r3.zzf
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r2 = r3.zzg
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r1 = java.util.Arrays.hashCode(r1)
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Picture: mimeType="
            r0.append(r1)
            java.lang.String r1 = r2.zzb
            r0.append(r1)
            java.lang.String r1 = ", description="
            r0.append(r1)
            java.lang.String r1 = r2.zzc
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            int r2 = r0.zza
            r1.writeInt(r2)
            java.lang.String r2 = r0.zzb
            r1.writeString(r2)
            java.lang.String r2 = r0.zzc
            r1.writeString(r2)
            int r2 = r0.zzd
            r1.writeInt(r2)
            int r2 = r0.zze
            r1.writeInt(r2)
            int r2 = r0.zzf
            r1.writeInt(r2)
            int r2 = r0.zzg
            r1.writeInt(r2)
            byte[] r2 = r0.zzh
            r1.writeByteArray(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbj
    public final void zza(com.google.android.gms.internal.ads.zzbf r3) {
            r2 = this;
            byte[] r0 = r2.zzh
            int r1 = r2.zza
            r3.zza(r0, r1)
            return
    }
}
