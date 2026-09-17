package com.google.android.gms.auth.api.proxy;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
@com.google.android.gms.common.internal.ShowFirstParty
@com.google.android.gms.common.annotation.KeepForSdkWithMembers
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "ProxyResponseCreator")
/* loaded from: classes.dex */
public class ProxyResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.proxy.ProxyResponse> CREATOR = null;
    public static final int STATUS_CODE_NO_CONNECTION = -1;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 5)
    public final byte[] body;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 1)
    public final int googlePlayServicesStatusCode;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    public final android.app.PendingIntent recoveryAction;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    public final int statusCode;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField(id = 1000)
    final int zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 4)
    final android.os.Bundle zzb;

    static {
            com.google.android.gms.auth.api.proxy.zzb r0 = new com.google.android.gms.auth.api.proxy.zzb
            r0.<init>()
            com.google.android.gms.auth.api.proxy.ProxyResponse.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    ProxyResponse(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1000) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) android.app.PendingIntent r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) int r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) android.os.Bundle r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) byte[] r6) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.googlePlayServicesStatusCode = r2
            r0.statusCode = r4
            r0.zzb = r5
            r0.body = r6
            r0.recoveryAction = r3
            return
    }

    public ProxyResponse(int r8, android.app.PendingIntent r9, int r10, android.os.Bundle r11, byte[] r12) {
            r7 = this;
            r1 = 1
            r0 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public ProxyResponse(int r8, java.util.Map<java.lang.String, java.lang.String> r9, byte[] r10) {
            r7 = this;
            android.os.Bundle r5 = zza(r9)
            r1 = 1
            r2 = 0
            r3 = 0
            r0 = r7
            r4 = r8
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public static com.google.android.gms.auth.api.proxy.ProxyResponse createErrorProxyResponse(int r8, android.app.PendingIntent r9, int r10, java.util.Map<java.lang.String, java.lang.String> r11, byte[] r12) {
            com.google.android.gms.auth.api.proxy.ProxyResponse r7 = new com.google.android.gms.auth.api.proxy.ProxyResponse
            android.os.Bundle r5 = zza(r11)
            r1 = 1
            r0 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
    }

    private static android.os.Bundle zza(java.util.Map r3) {
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            if (r3 != 0) goto L8
            return r0
        L8:
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L10:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r3.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r0.putString(r2, r1)
            goto L10
        L2c:
            return r0
    }

    public java.util.Map<java.lang.String, java.lang.String> getHeaders() {
            r4 = this;
            android.os.Bundle r0 = r4.zzb
            if (r0 != 0) goto L9
            java.util.Map r0 = java.util.Collections.emptyMap()
            return r0
        L9:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            android.os.Bundle r1 = r4.zzb
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L18:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            android.os.Bundle r3 = r4.zzb
            java.lang.String r3 = r3.getString(r2)
            r0.put(r2, r3)
            goto L18
        L2e:
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            int r1 = r4.googlePlayServicesStatusCode
            r2 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r2, r1)
            android.app.PendingIntent r1 = r4.recoveryAction
            r2 = 2
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            int r6 = r4.statusCode
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r1, r6)
            android.os.Bundle r6 = r4.zzb
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(r5, r1, r6, r3)
            byte[] r6 = r4.body
            r1 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(r5, r1, r6, r3)
            int r6 = r4.zza
            r1 = 1000(0x3e8, float:1.401E-42)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r1, r6)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }
}
