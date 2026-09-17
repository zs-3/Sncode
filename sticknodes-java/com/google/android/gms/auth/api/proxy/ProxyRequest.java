package com.google.android.gms.auth.api.proxy;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
@com.google.android.gms.common.internal.ShowFirstParty
@com.google.android.gms.common.annotation.KeepForSdkWithMembers
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "ProxyRequestCreator")
/* loaded from: classes.dex */
public class ProxyRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.proxy.ProxyRequest> CREATOR = null;
    public static final int HTTP_METHOD_DELETE = 0;
    public static final int HTTP_METHOD_GET = 0;
    public static final int HTTP_METHOD_HEAD = 0;
    public static final int HTTP_METHOD_OPTIONS = 0;
    public static final int HTTP_METHOD_PATCH = 0;
    public static final int HTTP_METHOD_POST = 0;
    public static final int HTTP_METHOD_PUT = 0;
    public static final int HTTP_METHOD_TRACE = 0;
    public static final int LAST_CODE = 0;
    public static final int VERSION_CODE = 2;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 4)
    public final byte[] body;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    public final int httpMethod;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    public final long timeoutMillis;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 1)
    public final java.lang.String url;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField(id = 1000)
    final int zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 5)
    final android.os.Bundle zzb;

    /* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdkWithMembers
    public static class Builder {
        private final java.lang.String zza;
        private int zzb;
        private long zzc;
        private byte[] zzd;
        private final android.os.Bundle zze;

        public Builder(java.lang.String r4) {
                r3 = this;
                r3.<init>()
                int r0 = com.google.android.gms.auth.api.proxy.ProxyRequest.HTTP_METHOD_GET
                r3.zzb = r0
                r0 = 3000(0xbb8, double:1.482E-320)
                r3.zzc = r0
                r0 = 0
                byte[] r0 = new byte[r0]
                r3.zzd = r0
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                r3.zze = r0
                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)
                java.util.regex.Pattern r0 = android.util.Patterns.WEB_URL
                java.util.regex.Matcher r0 = r0.matcher(r4)
                boolean r0 = r0.matches()
                if (r0 == 0) goto L29
                r3.zza = r4
                return
            L29:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "The supplied url [ "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = "] is not match Patterns.WEB_URL!"
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        public com.google.android.gms.auth.api.proxy.ProxyRequest build() {
                r9 = this;
                byte[] r0 = r9.zzd
                if (r0 != 0) goto L9
                r0 = 0
                byte[] r0 = new byte[r0]
                r9.zzd = r0
            L9:
                com.google.android.gms.auth.api.proxy.ProxyRequest r0 = new com.google.android.gms.auth.api.proxy.ProxyRequest
                r2 = 2
                java.lang.String r3 = r9.zza
                int r4 = r9.zzb
                long r5 = r9.zzc
                byte[] r7 = r9.zzd
                android.os.Bundle r8 = r9.zze
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r7, r8)
                return r0
        }

        public com.google.android.gms.auth.api.proxy.ProxyRequest.Builder putHeader(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "Header name cannot be null or empty!"
                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2, r0)
                android.os.Bundle r0 = r1.zze
                if (r3 != 0) goto Lb
                java.lang.String r3 = ""
            Lb:
                r0.putString(r2, r3)
                return r1
        }

        public com.google.android.gms.auth.api.proxy.ProxyRequest.Builder setBody(byte[] r1) {
                r0 = this;
                r0.zzd = r1
                return r0
        }

        public com.google.android.gms.auth.api.proxy.ProxyRequest.Builder setHttpMethod(int r3) {
                r2 = this;
                r0 = 0
                if (r3 < 0) goto L8
                int r1 = com.google.android.gms.auth.api.proxy.ProxyRequest.LAST_CODE
                if (r3 > r1) goto L8
                r0 = 1
            L8:
                java.lang.String r1 = "Unrecognized http method code."
                com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
                r2.zzb = r3
                return r2
        }

        public com.google.android.gms.auth.api.proxy.ProxyRequest.Builder setTimeoutMillis(long r4) {
                r3 = this;
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 < 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                java.lang.String r1 = "The specified timeout must be non-negative."
                com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
                r3.zzc = r4
                return r3
        }
    }

    static {
            com.google.android.gms.auth.api.proxy.zza r0 = new com.google.android.gms.auth.api.proxy.zza
            r0.<init>()
            com.google.android.gms.auth.api.proxy.ProxyRequest.CREATOR = r0
            r0 = 0
            com.google.android.gms.auth.api.proxy.ProxyRequest.HTTP_METHOD_GET = r0
            r0 = 1
            com.google.android.gms.auth.api.proxy.ProxyRequest.HTTP_METHOD_POST = r0
            r0 = 2
            com.google.android.gms.auth.api.proxy.ProxyRequest.HTTP_METHOD_PUT = r0
            r0 = 3
            com.google.android.gms.auth.api.proxy.ProxyRequest.HTTP_METHOD_DELETE = r0
            r0 = 4
            com.google.android.gms.auth.api.proxy.ProxyRequest.HTTP_METHOD_HEAD = r0
            r0 = 5
            com.google.android.gms.auth.api.proxy.ProxyRequest.HTTP_METHOD_OPTIONS = r0
            r0 = 6
            com.google.android.gms.auth.api.proxy.ProxyRequest.HTTP_METHOD_TRACE = r0
            r0 = 7
            com.google.android.gms.auth.api.proxy.ProxyRequest.HTTP_METHOD_PATCH = r0
            com.google.android.gms.auth.api.proxy.ProxyRequest.LAST_CODE = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    ProxyRequest(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1000) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) java.lang.String r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) int r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) long r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) byte[] r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) android.os.Bundle r7) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.url = r2
            r0.httpMethod = r3
            r0.timeoutMillis = r4
            r0.body = r6
            r0.zzb = r7
            return
    }

    public java.util.Map<java.lang.String, java.lang.String> getHeaderMap() {
            r4 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            android.os.Bundle r1 = r4.zzb
            int r1 = r1.size()
            r0.<init>(r1)
            android.os.Bundle r1 = r4.zzb
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L15:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            android.os.Bundle r3 = r4.zzb
            java.lang.String r3 = r3.getString(r2)
            if (r3 != 0) goto L2b
            java.lang.String r3 = ""
        L2b:
            r0.put(r2, r3)
            goto L15
        L2f:
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = r4.url
            int r1 = r4.httpMethod
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "ProxyRequest[ url: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ", method: "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = " ]"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            java.lang.String r0 = r4.url
            r1 = 1
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r1, r0, r2)
            int r0 = r4.httpMethod
            r1 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r1, r0)
            long r0 = r4.timeoutMillis
            r3 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r5, r3, r0)
            byte[] r0 = r4.body
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(r5, r1, r0, r2)
            android.os.Bundle r0 = r4.zzb
            r1 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(r5, r1, r0, r2)
            int r0 = r4.zza
            r1 = 1000(0x3e8, float:1.401E-42)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r1, r0)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r6)
            return
    }
}
