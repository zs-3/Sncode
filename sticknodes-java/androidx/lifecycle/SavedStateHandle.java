package androidx.lifecycle;

/* compiled from: SavedStateHandle.kt */
/* loaded from: classes.dex */
public final class SavedStateHandle {
    private static final java.lang.Class<? extends java.lang.Object>[] ACCEPTABLE_CLASSES = null;
    public static final androidx.lifecycle.SavedStateHandle.Companion Companion = null;
    private final java.util.Map<java.lang.String, kotlinx.coroutines.flow.MutableStateFlow<java.lang.Object>> flows;
    private final java.util.Map<java.lang.String, java.lang.Object> liveDatas;
    private final java.util.Map<java.lang.String, java.lang.Object> regular;
    private final androidx.savedstate.SavedStateRegistry.SavedStateProvider savedStateProvider;
    private final java.util.Map<java.lang.String, androidx.savedstate.SavedStateRegistry.SavedStateProvider> savedStateProviders;

    /* compiled from: SavedStateHandle.kt */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final androidx.lifecycle.SavedStateHandle createHandle(android.os.Bundle r6, android.os.Bundle r7) {
                r5 = this;
                if (r6 != 0) goto L37
                if (r7 != 0) goto La
                androidx.lifecycle.SavedStateHandle r6 = new androidx.lifecycle.SavedStateHandle
                r6.<init>()
                goto L36
            La:
                java.util.HashMap r6 = new java.util.HashMap
                r6.<init>()
                java.util.Set r0 = r7.keySet()
                java.util.Iterator r0 = r0.iterator()
            L17:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L30
                java.lang.Object r1 = r0.next()
                java.lang.String r1 = (java.lang.String) r1
                java.lang.String r2 = "key"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
                java.lang.Object r2 = r7.get(r1)
                r6.put(r1, r2)
                goto L17
            L30:
                androidx.lifecycle.SavedStateHandle r7 = new androidx.lifecycle.SavedStateHandle
                r7.<init>(r6)
                r6 = r7
            L36:
                return r6
            L37:
                java.lang.String r7 = "keys"
                java.util.ArrayList r7 = r6.getParcelableArrayList(r7)
                java.lang.String r0 = "values"
                java.util.ArrayList r6 = r6.getParcelableArrayList(r0)
                r0 = 0
                if (r7 == 0) goto L54
                if (r6 == 0) goto L54
                int r1 = r7.size()
                int r2 = r6.size()
                if (r1 != r2) goto L54
                r1 = 1
                goto L55
            L54:
                r1 = 0
            L55:
                if (r1 == 0) goto L7d
                java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
                r1.<init>()
                int r2 = r7.size()
            L60:
                if (r0 >= r2) goto L77
                java.lang.Object r3 = r7.get(r0)
                java.lang.String r4 = "null cannot be cast to non-null type kotlin.String"
                java.util.Objects.requireNonNull(r3, r4)
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r4 = r6.get(r0)
                r1.put(r3, r4)
                int r0 = r0 + 1
                goto L60
            L77:
                androidx.lifecycle.SavedStateHandle r6 = new androidx.lifecycle.SavedStateHandle
                r6.<init>(r1)
                return r6
            L7d:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "Invalid bundle passed as restored state"
                java.lang.String r7 = r7.toString()
                r6.<init>(r7)
                throw r6
        }

        public final boolean validateValue(java.lang.Object r7) {
                r6 = this;
                r0 = 1
                if (r7 != 0) goto L4
                return r0
            L4:
                java.lang.Class[] r1 = androidx.lifecycle.SavedStateHandle.access$getACCEPTABLE_CLASSES$cp()
                int r2 = r1.length
                r3 = 0
                r4 = 0
            Lb:
                if (r4 >= r2) goto L1c
                r5 = r1[r4]
                kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
                boolean r5 = r5.isInstance(r7)
                if (r5 == 0) goto L19
                return r0
            L19:
                int r4 = r4 + 1
                goto Lb
            L1c:
                return r3
        }
    }

    public static /* synthetic */ android.os.Bundle $r8$lambda$85q68529u9GpNelrug3JBSyWf4c(androidx.lifecycle.SavedStateHandle r0) {
            android.os.Bundle r0 = m15savedStateProvider$lambda0(r0)
            return r0
    }

    static {
            androidx.lifecycle.SavedStateHandle$Companion r0 = new androidx.lifecycle.SavedStateHandle$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.lifecycle.SavedStateHandle.Companion = r0
            r0 = 29
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r2 = 0
            r0[r2] = r1
            r1 = 1
            java.lang.Class<boolean[]> r2 = boolean[].class
            r0[r1] = r2
            java.lang.Class r1 = java.lang.Double.TYPE
            r2 = 2
            r0[r2] = r1
            r1 = 3
            java.lang.Class<double[]> r2 = double[].class
            r0[r1] = r2
            java.lang.Class r1 = java.lang.Integer.TYPE
            r2 = 4
            r0[r2] = r1
            r1 = 5
            java.lang.Class<int[]> r2 = int[].class
            r0[r1] = r2
            java.lang.Class r1 = java.lang.Long.TYPE
            r2 = 6
            r0[r2] = r1
            r1 = 7
            java.lang.Class<long[]> r2 = long[].class
            r0[r1] = r2
            r1 = 8
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r0[r1] = r2
            r1 = 9
            java.lang.Class<java.lang.String[]> r2 = java.lang.String[].class
            r0[r1] = r2
            r1 = 10
            java.lang.Class<android.os.Binder> r2 = android.os.Binder.class
            r0[r1] = r2
            r1 = 11
            java.lang.Class<android.os.Bundle> r2 = android.os.Bundle.class
            r0[r1] = r2
            java.lang.Class r1 = java.lang.Byte.TYPE
            r2 = 12
            r0[r2] = r1
            r1 = 13
            java.lang.Class<byte[]> r2 = byte[].class
            r0[r1] = r2
            java.lang.Class r1 = java.lang.Character.TYPE
            r2 = 14
            r0[r2] = r1
            r1 = 15
            java.lang.Class<char[]> r2 = char[].class
            r0[r1] = r2
            r1 = 16
            java.lang.Class<java.lang.CharSequence> r2 = java.lang.CharSequence.class
            r0[r1] = r2
            r1 = 17
            java.lang.Class<java.lang.CharSequence[]> r2 = java.lang.CharSequence[].class
            r0[r1] = r2
            r1 = 18
            java.lang.Class<java.util.ArrayList> r2 = java.util.ArrayList.class
            r0[r1] = r2
            java.lang.Class r1 = java.lang.Float.TYPE
            r2 = 19
            r0[r2] = r1
            r1 = 20
            java.lang.Class<float[]> r2 = float[].class
            r0[r1] = r2
            r1 = 21
            java.lang.Class<android.os.Parcelable> r2 = android.os.Parcelable.class
            r0[r1] = r2
            r1 = 22
            java.lang.Class<android.os.Parcelable[]> r2 = android.os.Parcelable[].class
            r0[r1] = r2
            r1 = 23
            java.lang.Class<java.io.Serializable> r2 = java.io.Serializable.class
            r0[r1] = r2
            java.lang.Class r1 = java.lang.Short.TYPE
            r2 = 24
            r0[r2] = r1
            r1 = 25
            java.lang.Class<short[]> r2 = short[].class
            r0[r1] = r2
            r1 = 26
            java.lang.Class<android.util.SparseArray> r2 = android.util.SparseArray.class
            r0[r1] = r2
            java.lang.Class<android.util.Size> r1 = android.util.Size.class
            r2 = 27
            r0[r2] = r1
            r1 = 28
            java.lang.Class<android.util.SizeF> r2 = android.util.SizeF.class
            r0[r1] = r2
            androidx.lifecycle.SavedStateHandle.ACCEPTABLE_CLASSES = r0
            return
    }

    public SavedStateHandle() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.regular = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.savedStateProviders = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.liveDatas = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.flows = r0
            androidx.lifecycle.SavedStateHandle$$ExternalSyntheticLambda0 r0 = new androidx.lifecycle.SavedStateHandle$$ExternalSyntheticLambda0
            r0.<init>(r1)
            r1.savedStateProvider = r0
            return
    }

    public SavedStateHandle(java.util.Map<java.lang.String, ? extends java.lang.Object> r3) {
            r2 = this;
            java.lang.String r0 = "initialState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r2.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r2.regular = r0
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r2.savedStateProviders = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r2.liveDatas = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r2.flows = r1
            androidx.lifecycle.SavedStateHandle$$ExternalSyntheticLambda0 r1 = new androidx.lifecycle.SavedStateHandle$$ExternalSyntheticLambda0
            r1.<init>(r2)
            r2.savedStateProvider = r1
            r0.putAll(r3)
            return
    }

    public static final /* synthetic */ java.lang.Class[] access$getACCEPTABLE_CLASSES$cp() {
            java.lang.Class<? extends java.lang.Object>[] r0 = androidx.lifecycle.SavedStateHandle.ACCEPTABLE_CLASSES
            return r0
    }

    public static final androidx.lifecycle.SavedStateHandle createHandle(android.os.Bundle r1, android.os.Bundle r2) {
            androidx.lifecycle.SavedStateHandle$Companion r0 = androidx.lifecycle.SavedStateHandle.Companion
            androidx.lifecycle.SavedStateHandle r1 = r0.createHandle(r1, r2)
            return r1
    }

    /* renamed from: savedStateProvider$lambda-0, reason: not valid java name */
    private static final android.os.Bundle m15savedStateProvider$lambda0(androidx.lifecycle.SavedStateHandle r5) {
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.Map<java.lang.String, androidx.savedstate.SavedStateRegistry$SavedStateProvider> r0 = r5.savedStateProviders
            java.util.Map r0 = kotlin.collections.MapsKt.toMap(r0)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L33
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            androidx.savedstate.SavedStateRegistry$SavedStateProvider r1 = (androidx.savedstate.SavedStateRegistry.SavedStateProvider) r1
            android.os.Bundle r1 = r1.saveState()
            r5.set(r2, r1)
            goto L13
        L33:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r5.regular
            java.util.Set r0 = r0.keySet()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            r2.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L4f:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L68
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            r1.add(r3)
            java.util.Map<java.lang.String, java.lang.Object> r4 = r5.regular
            java.lang.Object r3 = r4.get(r3)
            r2.add(r3)
            goto L4f
        L68:
            r5 = 2
            kotlin.Pair[] r5 = new kotlin.Pair[r5]
            r0 = 0
            java.lang.String r3 = "keys"
            kotlin.Pair r1 = kotlin.TuplesKt.to(r3, r1)
            r5[r0] = r1
            r0 = 1
            java.lang.String r1 = "values"
            kotlin.Pair r1 = kotlin.TuplesKt.to(r1, r2)
            r5[r0] = r1
            android.os.Bundle r5 = androidx.core.os.BundleKt.bundleOf(r5)
            return r5
    }

    public final androidx.savedstate.SavedStateRegistry.SavedStateProvider savedStateProvider() {
            r1 = this;
            androidx.savedstate.SavedStateRegistry$SavedStateProvider r0 = r1.savedStateProvider
            return r0
    }

    public final <T> void set(java.lang.String r3, T r4) {
            r2 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.lifecycle.SavedStateHandle$Companion r0 = androidx.lifecycle.SavedStateHandle.Companion
            boolean r0 = r0.validateValue(r4)
            if (r0 == 0) goto L35
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.liveDatas
            java.lang.Object r0 = r0.get(r3)
            boolean r1 = r0 instanceof androidx.lifecycle.MutableLiveData
            if (r1 == 0) goto L1a
            androidx.lifecycle.MutableLiveData r0 = (androidx.lifecycle.MutableLiveData) r0
            goto L1b
        L1a:
            r0 = 0
        L1b:
            if (r0 == 0) goto L21
            r0.setValue(r4)
            goto L26
        L21:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.regular
            r0.put(r3, r4)
        L26:
            java.util.Map<java.lang.String, kotlinx.coroutines.flow.MutableStateFlow<java.lang.Object>> r0 = r2.flows
            java.lang.Object r3 = r0.get(r3)
            kotlinx.coroutines.flow.MutableStateFlow r3 = (kotlinx.coroutines.flow.MutableStateFlow) r3
            if (r3 != 0) goto L31
            goto L34
        L31:
            r3.setValue(r4)
        L34:
            return
        L35:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Can't put value with type "
            r0.append(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            java.lang.Class r4 = r4.getClass()
            r0.append(r4)
            java.lang.String r4 = " into saved state"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
    }
}
