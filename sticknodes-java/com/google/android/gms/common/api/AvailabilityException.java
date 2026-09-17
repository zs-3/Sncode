package com.google.android.gms.common.api;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes.dex */
public class AvailabilityException extends java.lang.Exception {
    private final androidx.collection.ArrayMap zaa;

    public AvailabilityException(androidx.collection.ArrayMap r1) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            return
    }

    public com.google.android.gms.common.ConnectionResult getConnectionResult(com.google.android.gms.common.api.GoogleApi<? extends com.google.android.gms.common.api.Api.ApiOptions> r5) {
            r4 = this;
            androidx.collection.ArrayMap r0 = r4.zaa
            com.google.android.gms.common.api.internal.ApiKey r5 = r5.getApiKey()
            java.lang.Object r0 = r0.get(r5)
            java.lang.String r1 = r5.zaa()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "The given API ("
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = ") was not part of the availability request."
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r0 == 0) goto L28
            r0 = 1
            goto L29
        L28:
            r0 = 0
        L29:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
            androidx.collection.ArrayMap r0 = r4.zaa
            java.lang.Object r5 = r0.get(r5)
            com.google.android.gms.common.ConnectionResult r5 = (com.google.android.gms.common.ConnectionResult) r5
            java.lang.Object r5 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            com.google.android.gms.common.ConnectionResult r5 = (com.google.android.gms.common.ConnectionResult) r5
            return r5
    }

    public com.google.android.gms.common.ConnectionResult getConnectionResult(com.google.android.gms.common.api.HasApiKey<? extends com.google.android.gms.common.api.Api.ApiOptions> r5) {
            r4 = this;
            androidx.collection.ArrayMap r0 = r4.zaa
            com.google.android.gms.common.api.internal.ApiKey r5 = r5.getApiKey()
            java.lang.Object r0 = r0.get(r5)
            java.lang.String r1 = r5.zaa()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "The given API ("
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = ") was not part of the availability request."
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r0 == 0) goto L28
            r0 = 1
            goto L29
        L28:
            r0 = 0
        L29:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
            androidx.collection.ArrayMap r0 = r4.zaa
            java.lang.Object r5 = r0.get(r5)
            com.google.android.gms.common.ConnectionResult r5 = (com.google.android.gms.common.ConnectionResult) r5
            java.lang.Object r5 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            com.google.android.gms.common.ConnectionResult r5 = (com.google.android.gms.common.ConnectionResult) r5
            return r5
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            androidx.collection.ArrayMap r1 = r7.zaa
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
            r2 = 1
            r3 = 1
        L11:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L51
            java.lang.Object r4 = r1.next()
            com.google.android.gms.common.api.internal.ApiKey r4 = (com.google.android.gms.common.api.internal.ApiKey) r4
            androidx.collection.ArrayMap r5 = r7.zaa
            java.lang.Object r5 = r5.get(r4)
            com.google.android.gms.common.ConnectionResult r5 = (com.google.android.gms.common.ConnectionResult) r5
            java.lang.Object r5 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            com.google.android.gms.common.ConnectionResult r5 = (com.google.android.gms.common.ConnectionResult) r5
            boolean r6 = r5.isSuccess()
            r6 = r6 ^ r2
            r3 = r3 & r6
            java.lang.String r4 = r4.zaa()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r4 = ": "
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            r0.add(r4)
            goto L11
        L51:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r3 == 0) goto L5e
            java.lang.String r2 = "None of the queried APIs are available. "
            r1.append(r2)
            goto L63
        L5e:
            java.lang.String r2 = "Some of the queried APIs are unavailable. "
            r1.append(r2)
        L63:
            java.lang.String r2 = "; "
            java.lang.String r0 = android.text.TextUtils.join(r2, r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
