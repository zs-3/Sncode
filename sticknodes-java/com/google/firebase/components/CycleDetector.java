package com.google.firebase.components;

/* loaded from: classes2.dex */
class CycleDetector {

    /* renamed from: com.google.firebase.components.CycleDetector$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static class ComponentNode {
        private final com.google.firebase.components.Component<?> component;
        private final java.util.Set<com.google.firebase.components.CycleDetector.ComponentNode> dependencies;
        private final java.util.Set<com.google.firebase.components.CycleDetector.ComponentNode> dependents;

        ComponentNode(com.google.firebase.components.Component<?> r2) {
                r1 = this;
                r1.<init>()
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r1.dependencies = r0
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r1.dependents = r0
                r1.component = r2
                return
        }

        void addDependency(com.google.firebase.components.CycleDetector.ComponentNode r2) {
                r1 = this;
                java.util.Set<com.google.firebase.components.CycleDetector$ComponentNode> r0 = r1.dependencies
                r0.add(r2)
                return
        }

        void addDependent(com.google.firebase.components.CycleDetector.ComponentNode r2) {
                r1 = this;
                java.util.Set<com.google.firebase.components.CycleDetector$ComponentNode> r0 = r1.dependents
                r0.add(r2)
                return
        }

        com.google.firebase.components.Component<?> getComponent() {
                r1 = this;
                com.google.firebase.components.Component<?> r0 = r1.component
                return r0
        }

        java.util.Set<com.google.firebase.components.CycleDetector.ComponentNode> getDependencies() {
                r1 = this;
                java.util.Set<com.google.firebase.components.CycleDetector$ComponentNode> r0 = r1.dependencies
                return r0
        }

        boolean isLeaf() {
                r1 = this;
                java.util.Set<com.google.firebase.components.CycleDetector$ComponentNode> r0 = r1.dependencies
                boolean r0 = r0.isEmpty()
                return r0
        }

        boolean isRoot() {
                r1 = this;
                java.util.Set<com.google.firebase.components.CycleDetector$ComponentNode> r0 = r1.dependents
                boolean r0 = r0.isEmpty()
                return r0
        }

        void removeDependent(com.google.firebase.components.CycleDetector.ComponentNode r2) {
                r1 = this;
                java.util.Set<com.google.firebase.components.CycleDetector$ComponentNode> r0 = r1.dependents
                r0.remove(r2)
                return
        }
    }

    private static class Dep {
        private final com.google.firebase.components.Qualified<?> anInterface;
        private final boolean set;

        private Dep(com.google.firebase.components.Qualified<?> r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.anInterface = r1
                r0.set = r2
                return
        }

        /* synthetic */ Dep(com.google.firebase.components.Qualified r1, boolean r2, com.google.firebase.components.CycleDetector.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        static /* synthetic */ boolean access$100(com.google.firebase.components.CycleDetector.Dep r0) {
                boolean r0 = r0.set
                return r0
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.google.firebase.components.CycleDetector.Dep
                r1 = 0
                if (r0 == 0) goto L18
                com.google.firebase.components.CycleDetector$Dep r4 = (com.google.firebase.components.CycleDetector.Dep) r4
                com.google.firebase.components.Qualified<?> r0 = r4.anInterface
                com.google.firebase.components.Qualified<?> r2 = r3.anInterface
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L18
                boolean r4 = r4.set
                boolean r0 = r3.set
                if (r4 != r0) goto L18
                r1 = 1
            L18:
                return r1
        }

        public int hashCode() {
                r2 = this;
                com.google.firebase.components.Qualified<?> r0 = r2.anInterface
                int r0 = r0.hashCode()
                r1 = 1000003(0xf4243, float:1.401303E-39)
                r0 = r0 ^ r1
                int r0 = r0 * r1
                boolean r1 = r2.set
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                int r1 = r1.hashCode()
                r0 = r0 ^ r1
                return r0
        }
    }

    static void detect(java.util.List<com.google.firebase.components.Component<?>> r7) {
            java.util.Set r0 = toGraph(r7)
            java.util.Set r1 = getRoots(r0)
            r2 = 0
        L9:
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L3f
            java.util.Iterator r3 = r1.iterator()
            java.lang.Object r3 = r3.next()
            com.google.firebase.components.CycleDetector$ComponentNode r3 = (com.google.firebase.components.CycleDetector.ComponentNode) r3
            r1.remove(r3)
            int r2 = r2 + 1
            java.util.Set r4 = r3.getDependencies()
            java.util.Iterator r4 = r4.iterator()
        L26:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L9
            java.lang.Object r5 = r4.next()
            com.google.firebase.components.CycleDetector$ComponentNode r5 = (com.google.firebase.components.CycleDetector.ComponentNode) r5
            r5.removeDependent(r3)
            boolean r6 = r5.isRoot()
            if (r6 == 0) goto L26
            r1.add(r5)
            goto L26
        L3f:
            int r7 = r7.size()
            if (r2 != r7) goto L46
            return
        L46:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r0 = r0.iterator()
        L4f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6f
            java.lang.Object r1 = r0.next()
            com.google.firebase.components.CycleDetector$ComponentNode r1 = (com.google.firebase.components.CycleDetector.ComponentNode) r1
            boolean r2 = r1.isRoot()
            if (r2 != 0) goto L4f
            boolean r2 = r1.isLeaf()
            if (r2 != 0) goto L4f
            com.google.firebase.components.Component r1 = r1.getComponent()
            r7.add(r1)
            goto L4f
        L6f:
            com.google.firebase.components.DependencyCycleException r0 = new com.google.firebase.components.DependencyCycleException
            r0.<init>(r7)
            throw r0
    }

    private static java.util.Set<com.google.firebase.components.CycleDetector.ComponentNode> getRoots(java.util.Set<com.google.firebase.components.CycleDetector.ComponentNode> r3) {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r3.next()
            com.google.firebase.components.CycleDetector$ComponentNode r1 = (com.google.firebase.components.CycleDetector.ComponentNode) r1
            boolean r2 = r1.isRoot()
            if (r2 == 0) goto L9
            r0.add(r1)
            goto L9
        L1f:
            return r0
    }

    private static java.util.Set<com.google.firebase.components.CycleDetector.ComponentNode> toGraph(java.util.List<com.google.firebase.components.Component<?>> r10) {
            java.util.HashMap r0 = new java.util.HashMap
            int r1 = r10.size()
            r0.<init>(r1)
            java.util.Iterator r10 = r10.iterator()
        Ld:
            boolean r1 = r10.hasNext()
            r2 = 0
            if (r1 == 0) goto L74
            java.lang.Object r1 = r10.next()
            com.google.firebase.components.Component r1 = (com.google.firebase.components.Component) r1
            com.google.firebase.components.CycleDetector$ComponentNode r3 = new com.google.firebase.components.CycleDetector$ComponentNode
            r3.<init>(r1)
            java.util.Set r4 = r1.getProvidedInterfaces()
            java.util.Iterator r4 = r4.iterator()
        L27:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Ld
            java.lang.Object r5 = r4.next()
            com.google.firebase.components.Qualified r5 = (com.google.firebase.components.Qualified) r5
            com.google.firebase.components.CycleDetector$Dep r6 = new com.google.firebase.components.CycleDetector$Dep
            boolean r7 = r1.isValue()
            r8 = 1
            r7 = r7 ^ r8
            r6.<init>(r5, r7, r2)
            boolean r7 = r0.containsKey(r6)
            if (r7 != 0) goto L4c
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            r0.put(r6, r7)
        L4c:
            java.lang.Object r7 = r0.get(r6)
            java.util.Set r7 = (java.util.Set) r7
            boolean r9 = r7.isEmpty()
            if (r9 != 0) goto L70
            boolean r6 = com.google.firebase.components.CycleDetector.Dep.access$100(r6)
            if (r6 == 0) goto L5f
            goto L70
        L5f:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r1 = 0
            r0[r1] = r5
            java.lang.String r1 = "Multiple components provide %s."
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r10.<init>(r0)
            throw r10
        L70:
            r7.add(r3)
            goto L27
        L74:
            java.util.Collection r10 = r0.values()
            java.util.Iterator r10 = r10.iterator()
        L7c:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto Le4
            java.lang.Object r1 = r10.next()
            java.util.Set r1 = (java.util.Set) r1
            java.util.Iterator r1 = r1.iterator()
        L8c:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L7c
            java.lang.Object r3 = r1.next()
            com.google.firebase.components.CycleDetector$ComponentNode r3 = (com.google.firebase.components.CycleDetector.ComponentNode) r3
            com.google.firebase.components.Component r4 = r3.getComponent()
            java.util.Set r4 = r4.getDependencies()
            java.util.Iterator r4 = r4.iterator()
        La4:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L8c
            java.lang.Object r5 = r4.next()
            com.google.firebase.components.Dependency r5 = (com.google.firebase.components.Dependency) r5
            boolean r6 = r5.isDirectInjection()
            if (r6 != 0) goto Lb7
            goto La4
        Lb7:
            com.google.firebase.components.CycleDetector$Dep r6 = new com.google.firebase.components.CycleDetector$Dep
            com.google.firebase.components.Qualified r7 = r5.getInterface()
            boolean r5 = r5.isSet()
            r6.<init>(r7, r5, r2)
            java.lang.Object r5 = r0.get(r6)
            java.util.Set r5 = (java.util.Set) r5
            if (r5 != 0) goto Lcd
            goto La4
        Lcd:
            java.util.Iterator r5 = r5.iterator()
        Ld1:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto La4
            java.lang.Object r6 = r5.next()
            com.google.firebase.components.CycleDetector$ComponentNode r6 = (com.google.firebase.components.CycleDetector.ComponentNode) r6
            r3.addDependency(r6)
            r6.addDependent(r3)
            goto Ld1
        Le4:
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        Lf1:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L101
            java.lang.Object r1 = r0.next()
            java.util.Set r1 = (java.util.Set) r1
            r10.addAll(r1)
            goto Lf1
        L101:
            return r10
    }
}
