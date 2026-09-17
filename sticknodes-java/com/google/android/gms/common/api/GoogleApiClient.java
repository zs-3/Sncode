package com.google.android.gms.common.api;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@java.lang.Deprecated
/* loaded from: classes.dex */
public abstract class GoogleApiClient {

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final java.lang.String DEFAULT_ACCOUNT = "<<default account>>";
    public static final int SIGN_IN_MODE_OPTIONAL = 2;
    public static final int SIGN_IN_MODE_REQUIRED = 1;
    private static final java.util.Set zaa = null;

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    @java.lang.Deprecated
    public static final class Builder {
        private android.accounts.Account zaa;
        private final java.util.Set zab;
        private final java.util.Set zac;
        private int zad;
        private android.view.View zae;
        private java.lang.String zaf;
        private java.lang.String zag;
        private final java.util.Map zah;
        private final android.content.Context zai;
        private final java.util.Map zaj;
        private com.google.android.gms.common.api.internal.LifecycleActivity zak;
        private int zal;
        private com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener zam;
        private android.os.Looper zan;
        private com.google.android.gms.common.GoogleApiAvailability zao;
        private com.google.android.gms.common.api.Api.AbstractClientBuilder zap;
        private final java.util.ArrayList zaq;
        private final java.util.ArrayList zar;

        public Builder(android.content.Context r2) {
                r1 = this;
                r1.<init>()
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r1.zab = r0
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r1.zac = r0
                androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
                r0.<init>()
                r1.zah = r0
                androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
                r0.<init>()
                r1.zaj = r0
                r0 = -1
                r1.zal = r0
                com.google.android.gms.common.GoogleApiAvailability r0 = com.google.android.gms.common.GoogleApiAvailability.getInstance()
                r1.zao = r0
                com.google.android.gms.common.api.Api$AbstractClientBuilder r0 = com.google.android.gms.signin.zad.zac
                r1.zap = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.zaq = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.zar = r0
                r1.zai = r2
                android.os.Looper r0 = r2.getMainLooper()
                r1.zan = r0
                java.lang.String r0 = r2.getPackageName()
                r1.zaf = r0
                java.lang.Class r2 = r2.getClass()
                java.lang.String r2 = r2.getName()
                r1.zag = r2
                return
        }

        public Builder(android.content.Context r1, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r2, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r3) {
                r0 = this;
                r0.<init>(r1)
                java.lang.String r1 = "Must provide a connected listener"
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r1)
                java.util.ArrayList r1 = r0.zaq
                r1.add(r2)
                java.lang.String r1 = "Must provide a connection failed listener"
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r1)
                java.util.ArrayList r1 = r0.zar
                r1.add(r3)
                return
        }

        private final void zab(com.google.android.gms.common.api.Api r4, com.google.android.gms.common.api.Api.ApiOptions r5, com.google.android.gms.common.api.Scope... r6) {
                r3 = this;
                com.google.android.gms.common.api.Api$BaseClientBuilder r0 = r4.zac()
                java.lang.String r1 = "Base client builder must not be null"
                java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0, r1)
                com.google.android.gms.common.api.Api$BaseClientBuilder r0 = (com.google.android.gms.common.api.Api.BaseClientBuilder) r0
                java.util.HashSet r1 = new java.util.HashSet
                java.util.List r5 = r0.getImpliedScopes(r5)
                r1.<init>(r5)
                int r5 = r6.length
                r0 = 0
            L17:
                if (r0 >= r5) goto L21
                r2 = r6[r0]
                r1.add(r2)
                int r0 = r0 + 1
                goto L17
            L21:
                java.util.Map r5 = r3.zah
                com.google.android.gms.common.internal.zab r6 = new com.google.android.gms.common.internal.zab
                r6.<init>(r1)
                r5.put(r4, r6)
                return
        }

        public com.google.android.gms.common.api.GoogleApiClient.Builder addApi(com.google.android.gms.common.api.Api<? extends com.google.android.gms.common.api.Api.ApiOptions.NotRequiredOptions> r3) {
                r2 = this;
                java.lang.String r0 = "Api must not be null"
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
                java.util.Map r0 = r2.zaj
                r1 = 0
                r0.put(r3, r1)
                com.google.android.gms.common.api.Api$BaseClientBuilder r3 = r3.zac()
                java.lang.String r0 = "Base client builder must not be null"
                java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
                com.google.android.gms.common.api.Api$BaseClientBuilder r3 = (com.google.android.gms.common.api.Api.BaseClientBuilder) r3
                java.util.List r3 = r3.getImpliedScopes(r1)
                java.util.Set r0 = r2.zac
                r0.addAll(r3)
                java.util.Set r0 = r2.zab
                r0.addAll(r3)
                return r2
        }

        public <O extends com.google.android.gms.common.api.Api.ApiOptions.HasOptions> com.google.android.gms.common.api.GoogleApiClient.Builder addApi(com.google.android.gms.common.api.Api<O> r2, O r3) {
                r1 = this;
                java.lang.String r0 = "Api must not be null"
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
                java.lang.String r0 = "Null options are not permitted for this Api"
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
                java.util.Map r0 = r1.zaj
                r0.put(r2, r3)
                com.google.android.gms.common.api.Api$BaseClientBuilder r2 = r2.zac()
                java.lang.String r0 = "Base client builder must not be null"
                java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
                com.google.android.gms.common.api.Api$BaseClientBuilder r2 = (com.google.android.gms.common.api.Api.BaseClientBuilder) r2
                java.util.List r2 = r2.getImpliedScopes(r3)
                java.util.Set r3 = r1.zac
                r3.addAll(r2)
                java.util.Set r3 = r1.zab
                r3.addAll(r2)
                return r1
        }

        public <O extends com.google.android.gms.common.api.Api.ApiOptions.HasOptions> com.google.android.gms.common.api.GoogleApiClient.Builder addApiIfAvailable(com.google.android.gms.common.api.Api<O> r2, O r3, com.google.android.gms.common.api.Scope... r4) {
                r1 = this;
                java.lang.String r0 = "Api must not be null"
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
                java.lang.String r0 = "Null options are not permitted for this Api"
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
                java.util.Map r0 = r1.zaj
                r0.put(r2, r3)
                r1.zab(r2, r3, r4)
                return r1
        }

        public <T extends com.google.android.gms.common.api.Api.ApiOptions.NotRequiredOptions> com.google.android.gms.common.api.GoogleApiClient.Builder addApiIfAvailable(com.google.android.gms.common.api.Api<? extends com.google.android.gms.common.api.Api.ApiOptions.NotRequiredOptions> r3, com.google.android.gms.common.api.Scope... r4) {
                r2 = this;
                java.lang.String r0 = "Api must not be null"
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
                java.util.Map r0 = r2.zaj
                r1 = 0
                r0.put(r3, r1)
                r2.zab(r3, r1, r4)
                return r2
        }

        public com.google.android.gms.common.api.GoogleApiClient.Builder addConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r2) {
                r1 = this;
                java.lang.String r0 = "Listener must not be null"
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
                java.util.ArrayList r0 = r1.zaq
                r0.add(r2)
                return r1
        }

        public com.google.android.gms.common.api.GoogleApiClient.Builder addOnConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r2) {
                r1 = this;
                java.lang.String r0 = "Listener must not be null"
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
                java.util.ArrayList r0 = r1.zar
                r0.add(r2)
                return r1
        }

        public com.google.android.gms.common.api.GoogleApiClient.Builder addScope(com.google.android.gms.common.api.Scope r2) {
                r1 = this;
                java.lang.String r0 = "Scope must not be null"
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
                java.util.Set r0 = r1.zab
                r0.add(r2)
                return r1
        }

        @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
        public com.google.android.gms.common.api.GoogleApiClient build() {
                r22 = this;
                r1 = r22
                java.util.Map r0 = r1.zaj
                boolean r0 = r0.isEmpty()
                r2 = 1
                r0 = r0 ^ r2
                java.lang.String r3 = "must call addApi() to add at least one API"
                com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r3)
                com.google.android.gms.common.internal.ClientSettings r0 = r22.zaa()
                java.util.Map r3 = r0.zad()
                androidx.collection.ArrayMap r11 = new androidx.collection.ArrayMap
                r11.<init>()
                androidx.collection.ArrayMap r14 = new androidx.collection.ArrayMap
                r14.<init>()
                java.util.ArrayList r15 = new java.util.ArrayList
                r15.<init>()
                java.util.Map r4 = r1.zaj
                java.util.Set r4 = r4.keySet()
                java.util.Iterator r12 = r4.iterator()
                r13 = 0
                r4 = 0
                r16 = r4
                r17 = 0
            L36:
                boolean r4 = r12.hasNext()
                if (r4 == 0) goto Lc1
                java.lang.Object r4 = r12.next()
                r10 = r4
                com.google.android.gms.common.api.Api r10 = (com.google.android.gms.common.api.Api) r10
                java.util.Map r4 = r1.zaj
                java.lang.Object r18 = r4.get(r10)
                java.lang.Object r4 = r3.get(r10)
                if (r4 == 0) goto L51
                r4 = 1
                goto L52
            L51:
                r4 = 0
            L52:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
                r11.put(r10, r5)
                com.google.android.gms.common.api.internal.zat r9 = new com.google.android.gms.common.api.internal.zat
                r9.<init>(r10, r4)
                r15.add(r9)
                com.google.android.gms.common.api.Api$AbstractClientBuilder r4 = r10.zaa()
                java.lang.Object r4 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
                r19 = r4
                com.google.android.gms.common.api.Api$AbstractClientBuilder r19 = (com.google.android.gms.common.api.Api.AbstractClientBuilder) r19
                android.content.Context r5 = r1.zai
                android.os.Looper r6 = r1.zan
                r4 = r19
                r7 = r0
                r8 = r18
                r20 = r9
                r21 = r10
                r10 = r20
                com.google.android.gms.common.api.Api$Client r4 = r4.buildClient(r5, r6, r7, r8, r9, r10)
                com.google.android.gms.common.api.Api$AnyClientKey r5 = r21.zab()
                r14.put(r5, r4)
                int r5 = r19.getPriority()
                if (r5 != r2) goto L94
                if (r18 == 0) goto L92
                r17 = 1
                goto L94
            L92:
                r17 = 0
            L94:
                boolean r4 = r4.providesSignIn()
                if (r4 == 0) goto L36
                if (r16 != 0) goto L9f
                r16 = r21
                goto L36
            L9f:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = r21.zad()
                java.lang.String r3 = r16.zad()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r2)
                java.lang.String r2 = " cannot be used with "
                r4.append(r2)
                r4.append(r3)
                java.lang.String r2 = r4.toString()
                r0.<init>(r2)
                throw r0
            Lc1:
                if (r16 == 0) goto L10f
                if (r17 != 0) goto Lef
                android.accounts.Account r3 = r1.zaa
                if (r3 != 0) goto Lcb
                r3 = 1
                goto Lcc
            Lcb:
                r3 = 0
            Lcc:
                java.lang.Object[] r4 = new java.lang.Object[r2]
                java.lang.String r5 = r16.zad()
                r4[r13] = r5
                java.lang.String r5 = "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead"
                com.google.android.gms.common.internal.Preconditions.checkState(r3, r5, r4)
                java.util.Set r3 = r1.zab
                java.util.Set r4 = r1.zac
                boolean r3 = r3.equals(r4)
                java.lang.Object[] r4 = new java.lang.Object[r2]
                java.lang.String r5 = r16.zad()
                r4[r13] = r5
                java.lang.String r5 = "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead."
                com.google.android.gms.common.internal.Preconditions.checkState(r3, r5, r4)
                goto L10f
            Lef:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = r16.zad()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "With using "
                r3.append(r4)
                r3.append(r2)
                java.lang.String r2 = ", GamesOptions can only be specified within GoogleSignInOptions.Builder"
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                r0.<init>(r2)
                throw r0
            L10f:
                java.util.Collection r3 = r14.values()
                int r16 = com.google.android.gms.common.api.internal.zabe.zad(r3, r2)
                android.content.Context r5 = r1.zai
                com.google.android.gms.common.api.internal.zabe r2 = new com.google.android.gms.common.api.internal.zabe
                java.util.concurrent.locks.ReentrantLock r6 = new java.util.concurrent.locks.ReentrantLock
                r6.<init>()
                android.os.Looper r7 = r1.zan
                com.google.android.gms.common.GoogleApiAvailability r9 = r1.zao
                com.google.android.gms.common.api.Api$AbstractClientBuilder r10 = r1.zap
                java.util.ArrayList r12 = r1.zaq
                java.util.ArrayList r13 = r1.zar
                int r3 = r1.zal
                r4 = r2
                r8 = r0
                r0 = r15
                r15 = r3
                r17 = r0
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                java.util.Set r3 = com.google.android.gms.common.api.GoogleApiClient.zaq()
                monitor-enter(r3)
                java.util.Set r0 = com.google.android.gms.common.api.GoogleApiClient.zaq()     // Catch: java.lang.Throwable -> L154
                r0.add(r2)     // Catch: java.lang.Throwable -> L154
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L154
                int r0 = r1.zal
                if (r0 < 0) goto L153
                com.google.android.gms.common.api.internal.LifecycleActivity r0 = r1.zak
                com.google.android.gms.common.api.internal.zak r0 = com.google.android.gms.common.api.internal.zak.zaa(r0)
                int r3 = r1.zal
                com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener r4 = r1.zam
                r0.zad(r3, r2, r4)
            L153:
                return r2
            L154:
                r0 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L154
                throw r0
        }

        public com.google.android.gms.common.api.GoogleApiClient.Builder enableAutoManage(androidx.fragment.app.FragmentActivity r3, int r4, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r5) {
                r2 = this;
                com.google.android.gms.common.api.internal.LifecycleActivity r0 = new com.google.android.gms.common.api.internal.LifecycleActivity
                r0.<init>(r3)
                if (r4 < 0) goto L9
                r3 = 1
                goto La
            L9:
                r3 = 0
            La:
                java.lang.String r1 = "clientId must be non-negative"
                com.google.android.gms.common.internal.Preconditions.checkArgument(r3, r1)
                r2.zal = r4
                r2.zam = r5
                r2.zak = r0
                return r2
        }

        public com.google.android.gms.common.api.GoogleApiClient.Builder enableAutoManage(androidx.fragment.app.FragmentActivity r2, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r3) {
                r1 = this;
                r0 = 0
                r1.enableAutoManage(r2, r0, r3)
                return r1
        }

        public com.google.android.gms.common.api.GoogleApiClient.Builder setAccountName(java.lang.String r3) {
                r2 = this;
                if (r3 != 0) goto L4
                r3 = 0
                goto Lc
            L4:
                android.accounts.Account r0 = new android.accounts.Account
                java.lang.String r1 = "com.google"
                r0.<init>(r3, r1)
                r3 = r0
            Lc:
                r2.zaa = r3
                return r2
        }

        public com.google.android.gms.common.api.GoogleApiClient.Builder setGravityForPopups(int r1) {
                r0 = this;
                r0.zad = r1
                return r0
        }

        public com.google.android.gms.common.api.GoogleApiClient.Builder setHandler(android.os.Handler r2) {
                r1 = this;
                java.lang.String r0 = "Handler must not be null"
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
                android.os.Looper r2 = r2.getLooper()
                r1.zan = r2
                return r1
        }

        public com.google.android.gms.common.api.GoogleApiClient.Builder setViewForPopups(android.view.View r2) {
                r1 = this;
                java.lang.String r0 = "View must not be null"
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
                r1.zae = r2
                return r1
        }

        public com.google.android.gms.common.api.GoogleApiClient.Builder useDefaultAccount() {
                r1 = this;
                java.lang.String r0 = "<<default account>>"
                r1.setAccountName(r0)
                return r1
        }

        public final com.google.android.gms.common.internal.ClientSettings zaa() {
                r11 = this;
                com.google.android.gms.signin.SignInOptions r0 = com.google.android.gms.signin.SignInOptions.zaa
                java.util.Map r1 = r11.zaj
                com.google.android.gms.common.api.Api r2 = com.google.android.gms.signin.zad.zag
                boolean r1 = r1.containsKey(r2)
                if (r1 == 0) goto L14
                java.util.Map r0 = r11.zaj
                java.lang.Object r0 = r0.get(r2)
                com.google.android.gms.signin.SignInOptions r0 = (com.google.android.gms.signin.SignInOptions) r0
            L14:
                r9 = r0
                com.google.android.gms.common.internal.ClientSettings r0 = new com.google.android.gms.common.internal.ClientSettings
                android.accounts.Account r2 = r11.zaa
                java.util.Set r3 = r11.zab
                java.util.Map r4 = r11.zah
                int r5 = r11.zad
                android.view.View r6 = r11.zae
                java.lang.String r7 = r11.zaf
                java.lang.String r8 = r11.zag
                r10 = 0
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                return r0
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    @java.lang.Deprecated
    public interface ConnectionCallbacks extends com.google.android.gms.common.api.internal.ConnectionCallbacks {
        public static final int CAUSE_NETWORK_LOST = 2;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    @java.lang.Deprecated
    public interface OnConnectionFailedListener extends com.google.android.gms.common.api.internal.OnConnectionFailedListener {
    }

    static {
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            com.google.android.gms.common.api.GoogleApiClient.zaa = r0
            return
    }

    public GoogleApiClient() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void dumpAll(java.lang.String r7, java.io.FileDescriptor r8, java.io.PrintWriter r9, java.lang.String[] r10) {
            java.util.Set r0 = com.google.android.gms.common.api.GoogleApiClient.zaa
            monitor-enter(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3b
            r1.<init>()     // Catch: java.lang.Throwable -> L3b
            r1.append(r7)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r2 = "  "
            r1.append(r2)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L3b
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> L3b
            r3 = 0
        L19:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L3b
            if (r4 == 0) goto L39
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.common.api.GoogleApiClient r4 = (com.google.android.gms.common.api.GoogleApiClient) r4     // Catch: java.lang.Throwable -> L3b
            java.io.PrintWriter r5 = r9.append(r7)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r6 = "GoogleApiClient#"
            java.io.PrintWriter r5 = r5.append(r6)     // Catch: java.lang.Throwable -> L3b
            int r6 = r3 + 1
            r5.println(r3)     // Catch: java.lang.Throwable -> L3b
            r4.dump(r1, r8, r9, r10)     // Catch: java.lang.Throwable -> L3b
            r3 = r6
            goto L19
        L39:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            return
        L3b:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            throw r7
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static java.util.Set<com.google.android.gms.common.api.GoogleApiClient> getAllClients() {
            java.util.Set r0 = com.google.android.gms.common.api.GoogleApiClient.zaa
            monitor-enter(r0)
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            throw r1
    }

    static /* bridge */ /* synthetic */ java.util.Set zaq() {
            java.util.Set r0 = com.google.android.gms.common.api.GoogleApiClient.zaa
            return r0
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public abstract com.google.android.gms.common.ConnectionResult blockingConnect();

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public abstract com.google.android.gms.common.ConnectionResult blockingConnect(long r1, java.util.concurrent.TimeUnit r3);

    public abstract com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> clearDefaultAccountAndReconnect();

    public abstract void connect();

    public void connect(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    public abstract void disconnect();

    public abstract void dump(java.lang.String r1, java.io.FileDescriptor r2, java.io.PrintWriter r3, java.lang.String[] r4);

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    @com.google.android.gms.common.annotation.KeepForSdk
    public <A extends com.google.android.gms.common.api.Api.AnyClient, R extends com.google.android.gms.common.api.Result, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<R, A>> T enqueue(T r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    @com.google.android.gms.common.annotation.KeepForSdk
    public <A extends com.google.android.gms.common.api.Api.AnyClient, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, A>> T execute(T r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public <C extends com.google.android.gms.common.api.Api.Client> C getClient(com.google.android.gms.common.api.Api.AnyClientKey<C> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    public abstract com.google.android.gms.common.ConnectionResult getConnectionResult(com.google.android.gms.common.api.Api<?> r1);

    @com.google.android.gms.common.annotation.KeepForSdk
    public android.content.Context getContext() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public android.os.Looper getLooper() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean hasApi(com.google.android.gms.common.api.Api<?> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    public abstract boolean hasConnectedApi(com.google.android.gms.common.api.Api<?> r1);

    public abstract boolean isConnected();

    public abstract boolean isConnecting();

    public abstract boolean isConnectionCallbacksRegistered(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r1);

    public abstract boolean isConnectionFailedListenerRegistered(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r1);

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean maybeSignIn(com.google.android.gms.common.api.internal.SignInConnectionListener r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void maybeSignOut() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public abstract void reconnect();

    public abstract void registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r1);

    public abstract void registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r1);

    @com.google.android.gms.common.annotation.KeepForSdk
    public <L> com.google.android.gms.common.api.internal.ListenerHolder<L> registerListener(L r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    public abstract void stopAutoManage(androidx.fragment.app.FragmentActivity r1);

    public abstract void unregisterConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r1);

    public abstract void unregisterConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r1);

    public void zao(com.google.android.gms.common.api.internal.zada r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    public void zap(com.google.android.gms.common.api.internal.zada r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }
}
