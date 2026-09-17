package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "CacheOfferingCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzbbg extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzbbg> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    public final java.lang.String zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    public final long zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 4)
    public final java.lang.String zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 5)
    public final java.lang.String zzd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 6)
    public final java.lang.String zze;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 7)
    public final android.os.Bundle zzf;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 8)
    public final boolean zzg;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 9)
    public long zzh;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 10)
    public java.lang.String zzi;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 11)
    public int zzj;

    static {
            com.google.android.gms.internal.ads.zzbbh r0 = new com.google.android.gms.internal.ads.zzbbh
            r0.<init>()
            com.google.android.gms.internal.ads.zzbbg.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    zzbbg(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) long r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) java.lang.String r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) java.lang.String r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) java.lang.String r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) android.os.Bundle r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 8) boolean r8, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 9) long r9, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 10) java.lang.String r11, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 11) int r12) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            java.lang.String r1 = ""
            if (r4 != 0) goto Lc
            r4 = r1
        Lc:
            r0.zzc = r4
            if (r5 != 0) goto L11
            r5 = r1
        L11:
            r0.zzd = r5
            if (r6 != 0) goto L16
            r6 = r1
        L16:
            r0.zze = r6
            if (r7 != 0) goto L1f
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
        L1f:
            r0.zzf = r7
            r0.zzg = r8
            r0.zzh = r9
            r0.zzi = r11
            r0.zzj = r12
            return
    }

    public static com.google.android.gms.internal.ads.zzbbg zza(android.net.Uri r17) {
            r0 = r17
            r1 = 0
            java.lang.String r2 = "gcache"
            java.lang.String r3 = r17.getScheme()     // Catch: java.lang.NumberFormatException -> La6 java.lang.NullPointerException -> La8
            boolean r2 = r2.equals(r3)     // Catch: java.lang.NumberFormatException -> La6 java.lang.NullPointerException -> La8
            if (r2 != 0) goto L10
            return r1
        L10:
            java.util.List r2 = r17.getPathSegments()     // Catch: java.lang.NumberFormatException -> La6 java.lang.NullPointerException -> La8
            int r3 = r2.size()     // Catch: java.lang.NumberFormatException -> La6 java.lang.NullPointerException -> La8
            r4 = 2
            if (r3 == r4) goto L34
            int r0 = r2.size()     // Catch: java.lang.NumberFormatException -> La6 java.lang.NullPointerException -> La8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> La6 java.lang.NullPointerException -> La8
            r2.<init>()     // Catch: java.lang.NumberFormatException -> La6 java.lang.NullPointerException -> La8
            java.lang.String r3 = "Expected 2 path parts for namespace and id, found :"
            r2.append(r3)     // Catch: java.lang.NumberFormatException -> La6 java.lang.NullPointerException -> La8
            r2.append(r0)     // Catch: java.lang.NumberFormatException -> La6 java.lang.NullPointerException -> La8
            java.lang.String r0 = r2.toString()     // Catch: java.lang.NumberFormatException -> La6 java.lang.NullPointerException -> La8
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)     // Catch: java.lang.NumberFormatException -> La6 java.lang.NullPointerException -> La8
            return r1
        L34:
            r3 = 0
            java.lang.Object r3 = r2.get(r3)     // Catch: java.lang.NumberFormatException -> La6 java.lang.NullPointerException -> La8
            r9 = r3
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.NumberFormatException -> La6 java.lang.NullPointerException -> La8
            r3 = 1
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.NumberFormatException -> La6 java.lang.NullPointerException -> La8
            r10 = r2
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.NumberFormatException -> La6 java.lang.NullPointerException -> La8
            java.lang.String r8 = r17.getHost()     // Catch: java.lang.NumberFormatException -> La6 java.lang.NullPointerException -> La8
            java.lang.String r2 = "url"
            java.lang.String r5 = r0.getQueryParameter(r2)     // Catch: java.lang.NumberFormatException -> La6 java.lang.NullPointerException -> La8
            java.lang.String r2 = "1"
            java.lang.String r3 = "read_only"
            java.lang.String r3 = r0.getQueryParameter(r3)     // Catch: java.lang.NumberFormatException -> La6 java.lang.NullPointerException -> La8
            boolean r12 = r2.equals(r3)     // Catch: java.lang.NumberFormatException -> La6 java.lang.NullPointerException -> La8
            java.lang.String r2 = "expiration"
            java.lang.String r2 = r0.getQueryParameter(r2)     // Catch: java.lang.NumberFormatException -> La6 java.lang.NullPointerException -> La8
            if (r2 != 0) goto L66
            r2 = 0
        L64:
            r6 = r2
            goto L6b
        L66:
            long r2 = java.lang.Long.parseLong(r2)     // Catch: java.lang.NumberFormatException -> La6 java.lang.NullPointerException -> La8
            goto L64
        L6b:
            android.os.Bundle r11 = new android.os.Bundle     // Catch: java.lang.NumberFormatException -> La6 java.lang.NullPointerException -> La8
            r11.<init>()     // Catch: java.lang.NumberFormatException -> La6 java.lang.NullPointerException -> La8
            java.util.Set r2 = r17.getQueryParameterNames()     // Catch: java.lang.NumberFormatException -> La6 java.lang.NullPointerException -> La8
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.NumberFormatException -> La6 java.lang.NullPointerException -> La8
        L78:
            boolean r3 = r2.hasNext()     // Catch: java.lang.NumberFormatException -> La6 java.lang.NullPointerException -> La8
            if (r3 == 0) goto L99
            java.lang.Object r3 = r2.next()     // Catch: java.lang.NumberFormatException -> La6 java.lang.NullPointerException -> La8
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.NumberFormatException -> La6 java.lang.NullPointerException -> La8
            java.lang.String r4 = "tag."
            boolean r4 = r3.startsWith(r4)     // Catch: java.lang.NumberFormatException -> La6 java.lang.NullPointerException -> La8
            if (r4 == 0) goto L78
            r4 = 4
            java.lang.String r4 = r3.substring(r4)     // Catch: java.lang.NumberFormatException -> La6 java.lang.NullPointerException -> La8
            java.lang.String r3 = r0.getQueryParameter(r3)     // Catch: java.lang.NumberFormatException -> La6 java.lang.NullPointerException -> La8
            r11.putString(r4, r3)     // Catch: java.lang.NumberFormatException -> La6 java.lang.NullPointerException -> La8
            goto L78
        L99:
            com.google.android.gms.internal.ads.zzbbg r0 = new com.google.android.gms.internal.ads.zzbbg     // Catch: java.lang.NumberFormatException -> La6 java.lang.NullPointerException -> La8
            r13 = 0
            java.lang.String r15 = ""
            r16 = 0
            r4 = r0
            r4.<init>(r5, r6, r8, r9, r10, r11, r12, r13, r15, r16)     // Catch: java.lang.NumberFormatException -> La6 java.lang.NullPointerException -> La8
            return r0
        La6:
            r0 = move-exception
            goto La9
        La8:
            r0 = move-exception
        La9:
            java.lang.String r2 = "Unable to parse Uri into cache offering."
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r2, r0)
            return r1
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r6, int r7) {
            r5 = this;
            java.lang.String r7 = r5.zza
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r6)
            r1 = 2
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r6, r1, r7, r2)
            long r3 = r5.zzb
            r7 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r6, r7, r3)
            java.lang.String r7 = r5.zzc
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r6, r1, r7, r2)
            java.lang.String r7 = r5.zzd
            r1 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r6, r1, r7, r2)
            java.lang.String r7 = r5.zze
            r1 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r6, r1, r7, r2)
            android.os.Bundle r7 = r5.zzf
            r1 = 7
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(r6, r1, r7, r2)
            boolean r7 = r5.zzg
            r1 = 8
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r6, r1, r7)
            long r3 = r5.zzh
            r7 = 9
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r6, r7, r3)
            java.lang.String r7 = r5.zzi
            r1 = 10
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r6, r1, r7, r2)
            int r7 = r5.zzj
            r1 = 11
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r6, r1, r7)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r6, r0)
            return
    }
}
