package com.google.android.gms.auth.api.signin.internal;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
/* loaded from: classes.dex */
public final class zbe extends com.google.android.gms.common.internal.GmsClient {
    private final com.google.android.gms.auth.api.signin.GoogleSignInOptions zba;

    public zbe(android.content.Context r8, android.os.Looper r9, com.google.android.gms.common.internal.ClientSettings r10, com.google.android.gms.auth.api.signin.GoogleSignInOptions r11, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r12, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r13) {
            r7 = this;
            r3 = 91
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            if (r11 == 0) goto L13
            com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder r8 = new com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder
            r8.<init>(r11)
            goto L18
        L13:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder r8 = new com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder
            r8.<init>()
        L18:
            java.lang.String r9 = com.google.android.gms.internal.p000authapi.zbas.zba()
            r8.setLogSessionId(r9)
            java.util.Set r9 = r10.getAllRequestedScopes()
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L44
            java.util.Set r9 = r10.getAllRequestedScopes()
            java.util.Iterator r9 = r9.iterator()
        L31:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L44
            java.lang.Object r10 = r9.next()
            com.google.android.gms.common.api.Scope r10 = (com.google.android.gms.common.api.Scope) r10
            r11 = 0
            com.google.android.gms.common.api.Scope[] r11 = new com.google.android.gms.common.api.Scope[r11]
            r8.requestScopes(r10, r11)
            goto L31
        L44:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r8 = r8.build()
            r7.zba = r8
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            goto L18
        L4:
            java.lang.String r0 = "com.google.android.gms.auth.api.signin.internal.ISignInService"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.auth.api.signin.internal.zbs
            if (r1 == 0) goto L12
            r3 = r0
            com.google.android.gms.auth.api.signin.internal.zbs r3 = (com.google.android.gms.auth.api.signin.internal.zbs) r3
            goto L18
        L12:
            com.google.android.gms.auth.api.signin.internal.zbs r0 = new com.google.android.gms.auth.api.signin.internal.zbs
            r0.<init>(r3)
            r3 = r0
        L18:
            return r3
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
            r1 = this;
            r0 = 12451000(0xbdfcb8, float:1.7447567E-38)
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getServiceDescriptor() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.auth.api.signin.internal.ISignInService"
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final android.content.Intent getSignInIntent() {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r1 = r2.zba
            android.content.Intent r0 = com.google.android.gms.auth.api.signin.internal.zbm.zbc(r0, r1)
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getStartServiceAction() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.auth.api.signin.service.START"
            return r0
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean providesSignIn() {
            r1 = this;
            r0 = 1
            return r0
    }

    public final com.google.android.gms.auth.api.signin.GoogleSignInOptions zba() {
            r1 = this;
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r0 = r1.zba
            return r0
    }
}
