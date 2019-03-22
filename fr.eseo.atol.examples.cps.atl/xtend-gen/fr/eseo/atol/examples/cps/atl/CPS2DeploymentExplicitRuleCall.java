package fr.eseo.atol.examples.cps.atl;

import com.google.common.collect.ImmutableList;
import fr.eseo.aof.extensions.AOFExtensions;
import fr.eseo.atol.examples.cps.atl.CPS;
import fr.eseo.atol.examples.cps.atl.Deployment;
import fr.eseo.atol.examples.cps.atl.Trace;
import fr.eseo.atol.gen.ATOLGen;
import fr.eseo.atol.gen.AbstractRule;
import fr.eseo.atol.gen.TupleRule;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import org.eclipse.papyrus.aof.core.IBox;
import org.eclipse.papyrus.aof.core.ISet;
import org.eclipse.papyrus.aof.core.IUnaryFunction;
import org.eclipse.papyrus.aof.operations.GroupByAs;
import org.eclipse.viatra.examples.cps.cyberPhysicalSystem.ApplicationInstance;
import org.eclipse.viatra.examples.cps.cyberPhysicalSystem.CyberPhysicalSystem;
import org.eclipse.viatra.examples.cps.cyberPhysicalSystem.HostInstance;
import org.eclipse.viatra.examples.cps.cyberPhysicalSystem.Identifiable;
import org.eclipse.viatra.examples.cps.cyberPhysicalSystem.State;
import org.eclipse.viatra.examples.cps.cyberPhysicalSystem.StateMachine;
import org.eclipse.viatra.examples.cps.cyberPhysicalSystem.Transition;
import org.eclipse.viatra.examples.cps.deployment.BehaviorState;
import org.eclipse.viatra.examples.cps.deployment.BehaviorTransition;
import org.eclipse.viatra.examples.cps.deployment.DeploymentApplication;
import org.eclipse.viatra.examples.cps.deployment.DeploymentBehavior;
import org.eclipse.viatra.examples.cps.deployment.DeploymentElement;
import org.eclipse.viatra.examples.cps.deployment.DeploymentHost;
import org.eclipse.viatra.examples.cps.traceability.CPS2DeploymentTrace;
import org.eclipse.viatra.examples.cps.xform.m2m.util.SignalUtil;
import org.eclipse.xtext.xbase.lib.Pair;

@ATOLGen(transformation = "src/fr/eseo/atol/examples/cps/atl/CPS2Deployment-explicitRuleCall.atl", metamodels = { @ATOLGen.Metamodel(name = "CPS", impl = CPS.class), @ATOLGen.Metamodel(name = "Deployment", impl = Deployment.class), @ATOLGen.Metamodel(name = "Trace", impl = Trace.class) })
@SuppressWarnings("all")
public class CPS2DeploymentExplicitRuleCall implements AOFExtensions {
  public static class SourceTupleCyberPhysicalSystem2Deployment {
    public SourceTupleCyberPhysicalSystem2Deployment(final CyberPhysicalSystem s) {
      super();
      this.s = s;
    }
    
    public final CyberPhysicalSystem s;
    
    public boolean equals(final Object o) {
      if(o instanceof SourceTupleCyberPhysicalSystem2Deployment) {
      	SourceTupleCyberPhysicalSystem2Deployment o2 = (SourceTupleCyberPhysicalSystem2Deployment)o;
      	return
      		Objects.equals(this.s, o2.s)
      	;
      } else {
      	return false;
      }
      
    }
    
    public int hashCode() {
      return Objects.hash(s);
    }
  }
  
  public static class TargetTupleCyberPhysicalSystem2Deployment {
    public TargetTupleCyberPhysicalSystem2Deployment(final org.eclipse.viatra.examples.cps.deployment.Deployment t) {
      super();
      this.t = t;
    }
    
    public TargetTupleCyberPhysicalSystem2Deployment() {
      super();
      this.t = Deployment.Deployment.newInstance();
    }
    
    public final org.eclipse.viatra.examples.cps.deployment.Deployment t;
    
    public boolean equals(final Object o) {
      if(o instanceof TargetTupleCyberPhysicalSystem2Deployment) {
      	TargetTupleCyberPhysicalSystem2Deployment o2 = (TargetTupleCyberPhysicalSystem2Deployment)o;
      	return
      		Objects.equals(this.t, o2.t)
      	;
      } else {
      	return false;
      }
      
    }
    
    public int hashCode() {
      return Objects.hash(t);
    }
  }
  
  public static class SourceTupleHostInstance2DeploymentHost {
    public SourceTupleHostInstance2DeploymentHost(final HostInstance s) {
      super();
      this.s = s;
    }
    
    public final HostInstance s;
    
    public boolean equals(final Object o) {
      if(o instanceof SourceTupleHostInstance2DeploymentHost) {
      	SourceTupleHostInstance2DeploymentHost o2 = (SourceTupleHostInstance2DeploymentHost)o;
      	return
      		Objects.equals(this.s, o2.s)
      	;
      } else {
      	return false;
      }
      
    }
    
    public int hashCode() {
      return Objects.hash(s);
    }
  }
  
  public static class TargetTupleHostInstance2DeploymentHost {
    public TargetTupleHostInstance2DeploymentHost(final DeploymentHost t) {
      super();
      this.t = t;
    }
    
    public TargetTupleHostInstance2DeploymentHost() {
      super();
      this.t = Deployment.DeploymentHost.newInstance();
    }
    
    public final DeploymentHost t;
    
    public boolean equals(final Object o) {
      if(o instanceof TargetTupleHostInstance2DeploymentHost) {
      	TargetTupleHostInstance2DeploymentHost o2 = (TargetTupleHostInstance2DeploymentHost)o;
      	return
      		Objects.equals(this.t, o2.t)
      	;
      } else {
      	return false;
      }
      
    }
    
    public int hashCode() {
      return Objects.hash(t);
    }
  }
  
  public static class SourceTupleApplicationInstance2DeploymentApplication {
    public SourceTupleApplicationInstance2DeploymentApplication(final ApplicationInstance s) {
      super();
      this.s = s;
    }
    
    public final ApplicationInstance s;
    
    public boolean equals(final Object o) {
      if(o instanceof SourceTupleApplicationInstance2DeploymentApplication) {
      	SourceTupleApplicationInstance2DeploymentApplication o2 = (SourceTupleApplicationInstance2DeploymentApplication)o;
      	return
      		Objects.equals(this.s, o2.s)
      	;
      } else {
      	return false;
      }
      
    }
    
    public int hashCode() {
      return Objects.hash(s);
    }
  }
  
  public static class TargetTupleApplicationInstance2DeploymentApplication {
    public TargetTupleApplicationInstance2DeploymentApplication(final DeploymentApplication t) {
      super();
      this.t = t;
    }
    
    public TargetTupleApplicationInstance2DeploymentApplication() {
      super();
      this.t = Deployment.DeploymentApplication.newInstance();
    }
    
    public final DeploymentApplication t;
    
    public boolean equals(final Object o) {
      if(o instanceof TargetTupleApplicationInstance2DeploymentApplication) {
      	TargetTupleApplicationInstance2DeploymentApplication o2 = (TargetTupleApplicationInstance2DeploymentApplication)o;
      	return
      		Objects.equals(this.t, o2.t)
      	;
      } else {
      	return false;
      }
      
    }
    
    public int hashCode() {
      return Objects.hash(t);
    }
  }
  
  public static class SourceTupleApplicationInstanceAndStateMachine2DeploymentBehavior {
    public SourceTupleApplicationInstanceAndStateMachine2DeploymentBehavior(final ApplicationInstance ai, final StateMachine sm) {
      super();
      this.ai = ai;
      this.sm = sm;
    }
    
    public final ApplicationInstance ai;
    
    public final StateMachine sm;
    
    public boolean equals(final Object o) {
      if(o instanceof SourceTupleApplicationInstanceAndStateMachine2DeploymentBehavior) {
      	SourceTupleApplicationInstanceAndStateMachine2DeploymentBehavior o2 = (SourceTupleApplicationInstanceAndStateMachine2DeploymentBehavior)o;
      	return
      		Objects.equals(this.ai, o2.ai) &&
      		Objects.equals(this.sm, o2.sm)
      	;
      } else {
      	return false;
      }
      
    }
    
    public int hashCode() {
      return Objects.hash(ai, sm);
    }
  }
  
  public static class TargetTupleApplicationInstanceAndStateMachine2DeploymentBehavior {
    public TargetTupleApplicationInstanceAndStateMachine2DeploymentBehavior(final DeploymentBehavior t) {
      super();
      this.t = t;
    }
    
    public TargetTupleApplicationInstanceAndStateMachine2DeploymentBehavior() {
      super();
      this.t = Deployment.DeploymentBehavior.newInstance();
    }
    
    public final DeploymentBehavior t;
    
    public boolean equals(final Object o) {
      if(o instanceof TargetTupleApplicationInstanceAndStateMachine2DeploymentBehavior) {
      	TargetTupleApplicationInstanceAndStateMachine2DeploymentBehavior o2 = (TargetTupleApplicationInstanceAndStateMachine2DeploymentBehavior)o;
      	return
      		Objects.equals(this.t, o2.t)
      	;
      } else {
      	return false;
      }
      
    }
    
    public int hashCode() {
      return Objects.hash(t);
    }
  }
  
  public static class SourceTupleApplicationInstanceAndState2BehaviorState {
    public SourceTupleApplicationInstanceAndState2BehaviorState(final ApplicationInstance ai, final State s) {
      super();
      this.ai = ai;
      this.s = s;
    }
    
    public final ApplicationInstance ai;
    
    public final State s;
    
    public boolean equals(final Object o) {
      if(o instanceof SourceTupleApplicationInstanceAndState2BehaviorState) {
      	SourceTupleApplicationInstanceAndState2BehaviorState o2 = (SourceTupleApplicationInstanceAndState2BehaviorState)o;
      	return
      		Objects.equals(this.ai, o2.ai) &&
      		Objects.equals(this.s, o2.s)
      	;
      } else {
      	return false;
      }
      
    }
    
    public int hashCode() {
      return Objects.hash(ai, s);
    }
  }
  
  public static class TargetTupleApplicationInstanceAndState2BehaviorState {
    public TargetTupleApplicationInstanceAndState2BehaviorState(final BehaviorState t) {
      super();
      this.t = t;
    }
    
    public TargetTupleApplicationInstanceAndState2BehaviorState() {
      super();
      this.t = Deployment.BehaviorState.newInstance();
    }
    
    public final BehaviorState t;
    
    public boolean equals(final Object o) {
      if(o instanceof TargetTupleApplicationInstanceAndState2BehaviorState) {
      	TargetTupleApplicationInstanceAndState2BehaviorState o2 = (TargetTupleApplicationInstanceAndState2BehaviorState)o;
      	return
      		Objects.equals(this.t, o2.t)
      	;
      } else {
      	return false;
      }
      
    }
    
    public int hashCode() {
      return Objects.hash(t);
    }
  }
  
  public static class SourceTupleApplicationInstanceAndTransition2BehaviorTransition {
    public SourceTupleApplicationInstanceAndTransition2BehaviorTransition(final ApplicationInstance ai, final Transition s) {
      super();
      this.ai = ai;
      this.s = s;
    }
    
    public final ApplicationInstance ai;
    
    public final Transition s;
    
    public boolean equals(final Object o) {
      if(o instanceof SourceTupleApplicationInstanceAndTransition2BehaviorTransition) {
      	SourceTupleApplicationInstanceAndTransition2BehaviorTransition o2 = (SourceTupleApplicationInstanceAndTransition2BehaviorTransition)o;
      	return
      		Objects.equals(this.ai, o2.ai) &&
      		Objects.equals(this.s, o2.s)
      	;
      } else {
      	return false;
      }
      
    }
    
    public int hashCode() {
      return Objects.hash(ai, s);
    }
  }
  
  public static class TargetTupleApplicationInstanceAndTransition2BehaviorTransition {
    public TargetTupleApplicationInstanceAndTransition2BehaviorTransition(final BehaviorTransition t) {
      super();
      this.t = t;
    }
    
    public TargetTupleApplicationInstanceAndTransition2BehaviorTransition() {
      super();
      this.t = Deployment.BehaviorTransition.newInstance();
    }
    
    public final BehaviorTransition t;
    
    public boolean equals(final Object o) {
      if(o instanceof TargetTupleApplicationInstanceAndTransition2BehaviorTransition) {
      	TargetTupleApplicationInstanceAndTransition2BehaviorTransition o2 = (TargetTupleApplicationInstanceAndTransition2BehaviorTransition)o;
      	return
      		Objects.equals(this.t, o2.t)
      	;
      } else {
      	return false;
      }
      
    }
    
    public int hashCode() {
      return Objects.hash(t);
    }
  }
  
  public final HashMap<DeploymentElement, Identifiable> reverseTrace = new HashMap<DeploymentElement, Identifiable>();
  
  public IBox<CPS2DeploymentTrace> trace(final org.eclipse.viatra.examples.cps.deployment.Deployment dep) {
    IBox<CPS2DeploymentTrace> _xblockexpression = null;
    {
      final ISet<DeploymentElement> allContents = this.<DeploymentElement>allContents(dep, null);
      _xblockexpression = this.createTrace(allContents.<DeploymentHost>select(DeploymentHost.class)).concat(
        this.createTrace(allContents.<DeploymentApplication>select(DeploymentApplication.class))).concat(
        this.createFlatTrace(allContents.<DeploymentBehavior>select(DeploymentBehavior.class))).concat(
        this.createFlatTrace(allContents.<BehaviorState>select(BehaviorState.class))).concat(
        this.createFlatTrace(allContents.<BehaviorTransition>select(BehaviorTransition.class)));
    }
    return _xblockexpression;
  }
  
  public IBox<CPS2DeploymentTrace> createTrace(final IBox<? extends DeploymentElement> targetElements) {
    final IUnaryFunction<DeploymentElement, CPS2DeploymentTrace> _function = (DeploymentElement target) -> {
      CPS2DeploymentTrace _xblockexpression = null;
      {
        final CPS2DeploymentTrace ret = Trace.CPS2DeploymentTrace.newInstance();
        Identifiable _get = this.reverseTrace.get(target);
        final Identifiable source = ((Identifiable) _get);
        ret.getCpsElements().add(source);
        ret.getDeploymentElements().add(target);
        _xblockexpression = ret;
      }
      return _xblockexpression;
    };
    return targetElements.<CPS2DeploymentTrace>collectTo(_function);
  }
  
  public IBox<CPS2DeploymentTrace> createFlatTrace(final IBox<? extends DeploymentElement> targetElements) {
    final IUnaryFunction<DeploymentElement, Identifiable> _function = (DeploymentElement it) -> {
      return this.reverseTrace.get(it);
    };
    final IUnaryFunction<Identifiable, CPS2DeploymentTrace> _function_1 = (Identifiable it) -> {
      CPS2DeploymentTrace _xblockexpression = null;
      {
        final CPS2DeploymentTrace ret = Trace.CPS2DeploymentTrace.newInstance();
        ret.getCpsElements().add(it);
        _xblockexpression = ret;
      }
      return _xblockexpression;
    };
    final IUnaryFunction<CPS2DeploymentTrace, IBox<? extends DeploymentElement>> _function_2 = (CPS2DeploymentTrace it) -> {
      return this.TraceMM._deploymentElements(it);
    };
    return new GroupByAs(targetElements, _function, _function_1, _function_2).getResult();
  }
  
  private final Pair<Object, Object> nullPair = Pair.<Object, Object>of(null, null);
  
  private final HashMap<Transition, IBox<Pair<String, String>>> sendPartsCache = new HashMap<Transition, IBox<Pair<String, String>>>();
  
  public IBox<Pair<String, String>> _sendParts(final Transition t) {
    final Function<Transition, IBox<Pair<String, String>>> _function = (Transition it) -> {
      final IUnaryFunction<String, Pair<String, String>> _function_1 = (String it_1) -> {
        Pair<String, String> _xifexpression = null;
        if (((it_1 != null) && SignalUtil.isSend(it_1))) {
          String _appId = SignalUtil.getAppId(it_1);
          String _signalId = SignalUtil.getSignalId(it_1);
          _xifexpression = Pair.<String, String>of(_appId, _signalId);
        } else {
          _xifexpression = ((Pair<String, String>) ((Pair<?, ?>) this.nullPair));
        }
        return _xifexpression;
      };
      return this.CPSMM._action(it).<Pair<String, String>>collect(_function_1);
    };
    return this.sendPartsCache.computeIfAbsent(t, _function);
  }
  
  private final HashMap<Transition, IBox<String>> waitPartsCache = new HashMap<Transition, IBox<String>>();
  
  public IBox<String> _waitParts(final Transition t) {
    final Function<Transition, IBox<String>> _function = (Transition it) -> {
      final IUnaryFunction<String, String> _function_1 = (String e) -> {
        String _xifexpression = null;
        if (((e != null) && SignalUtil.isWait(e))) {
          _xifexpression = SignalUtil.getSignalId(e);
        } else {
          _xifexpression = null;
        }
        return _xifexpression;
      };
      return this.CPSMM._action(it).<String>collect(_function_1).asOne(null);
    };
    return this.waitPartsCache.computeIfAbsent(t, _function);
  }
  
  private final HashMap<Object, Object> keyCache = new HashMap<Object, Object>();
  
  public <K extends Object, V extends Object> IBox<K> key(final IBox<Pair<K, V>> it) {
    IBox<K> _elvis = null;
    Object _get = this.keyCache.get(it);
    if (((IBox<K>) _get) != null) {
      _elvis = ((IBox<K>) _get);
    } else {
      IBox<K> _xblockexpression = null;
      {
        final IUnaryFunction<Pair<K, V>, K> _function = (Pair<K, V> it_1) -> {
          return it_1.getKey();
        };
        final IBox<K> ret = it.<K>collect(_function);
        this.keyCache.put(it, ret);
        _xblockexpression = ret;
      }
      _elvis = _xblockexpression;
    }
    return _elvis;
  }
  
  private final HashMap<Object, Object> valueCache = new HashMap<Object, Object>();
  
  public <K extends Object, V extends Object> IBox<V> value(final IBox<Pair<K, V>> it) {
    IBox<V> _elvis = null;
    Object _get = this.valueCache.get(it);
    if (((IBox<V>) _get) != null) {
      _elvis = ((IBox<V>) _get);
    } else {
      IBox<V> _xblockexpression = null;
      {
        final IUnaryFunction<Pair<K, V>, V> _function = (Pair<K, V> it_1) -> {
          return it_1.getValue();
        };
        final IBox<V> ret = it.<V>collect(_function);
        this.valueCache.put(it, ret);
        _xblockexpression = ret;
      }
      _elvis = _xblockexpression;
    }
    return _elvis;
  }
  
  public final CPS CPSMM = new CPS();
  
  public final Deployment DeploymentMM = new Deployment();
  
  public final Trace TraceMM = new Trace();
  
  public CPS2DeploymentExplicitRuleCall.TargetTupleCyberPhysicalSystem2Deployment CyberPhysicalSystem2Deployment(final CyberPhysicalSystem s) {
    return
    	CyberPhysicalSystem2Deployment.apply(new CPS2DeploymentExplicitRuleCall.SourceTupleCyberPhysicalSystem2Deployment(s))
    ;
  }
  
  public CPS2DeploymentExplicitRuleCall.TargetTupleHostInstance2DeploymentHost HostInstance2DeploymentHost(final HostInstance s) {
    return
    	HostInstance2DeploymentHost.apply(new CPS2DeploymentExplicitRuleCall.SourceTupleHostInstance2DeploymentHost(s))
    ;
  }
  
  public CPS2DeploymentExplicitRuleCall.TargetTupleApplicationInstance2DeploymentApplication ApplicationInstance2DeploymentApplication(final ApplicationInstance s) {
    return
    	ApplicationInstance2DeploymentApplication.apply(new CPS2DeploymentExplicitRuleCall.SourceTupleApplicationInstance2DeploymentApplication(s))
    ;
  }
  
  public CPS2DeploymentExplicitRuleCall.TargetTupleApplicationInstanceAndStateMachine2DeploymentBehavior ApplicationInstanceAndStateMachine2DeploymentBehavior(final ApplicationInstance ai, final StateMachine sm) {
    return
    	ApplicationInstanceAndStateMachine2DeploymentBehavior.apply(new CPS2DeploymentExplicitRuleCall.SourceTupleApplicationInstanceAndStateMachine2DeploymentBehavior(ai, sm))
    ;
  }
  
  public CPS2DeploymentExplicitRuleCall.TargetTupleApplicationInstanceAndState2BehaviorState ApplicationInstanceAndState2BehaviorState(final ApplicationInstance ai, final State s) {
    return
    	ApplicationInstanceAndState2BehaviorState.apply(new CPS2DeploymentExplicitRuleCall.SourceTupleApplicationInstanceAndState2BehaviorState(ai, s))
    ;
  }
  
  public CPS2DeploymentExplicitRuleCall.TargetTupleApplicationInstanceAndTransition2BehaviorTransition ApplicationInstanceAndTransition2BehaviorTransition(final ApplicationInstance ai, final Transition s) {
    return
    	ApplicationInstanceAndTransition2BehaviorTransition.apply(new CPS2DeploymentExplicitRuleCall.SourceTupleApplicationInstanceAndTransition2BehaviorTransition(ai, s))
    ;
  }
  
  public final TupleRule<CPS2DeploymentExplicitRuleCall.SourceTupleCyberPhysicalSystem2Deployment, CPS2DeploymentExplicitRuleCall.TargetTupleCyberPhysicalSystem2Deployment> CyberPhysicalSystem2Deployment = 	new TupleRule<>(
    	SourceTupleCyberPhysicalSystem2Deployment.class,
    	TargetTupleCyberPhysicalSystem2Deployment.class,
    	(in, out) -> {
    		CyberPhysicalSystem s = in.s;
    		org.eclipse.viatra.examples.cps.deployment.Deployment t = out.t;
    	// src/fr/eseo/atol/examples/cps/atl/CPS2Deployment-explicitRuleCall.atl#13:4-15:8
    	TupleRule.operator_spaceship(DeploymentMM._hosts(t),
    		CPSMM.instances1(CPSMM._hostTypes(s)).collect((e_1) ->
    			e_1 == null ?
    				null
    			:
    				this.HostInstance2DeploymentHost(
    					e_1
    				).t
    		)
    	);
    });
  
  public final TupleRule<CPS2DeploymentExplicitRuleCall.SourceTupleHostInstance2DeploymentHost, CPS2DeploymentExplicitRuleCall.TargetTupleHostInstance2DeploymentHost> HostInstance2DeploymentHost = 	new TupleRule<>(
    	SourceTupleHostInstance2DeploymentHost.class,
    	TargetTupleHostInstance2DeploymentHost.class,
    	(in, out) -> {
    		HostInstance s = in.s;
    		DeploymentHost t = out.t;
    	// src/fr/eseo/atol/examples/cps/atl/CPS2Deployment-explicitRuleCall.atl#24:4-24:18
    	TupleRule.operator_spaceship(DeploymentMM._ip(t),
    		CPSMM._nodeIp(s)
    	);
    	// src/fr/eseo/atol/examples/cps/atl/CPS2Deployment-explicitRuleCall.atl#25:4-27:9
    	TupleRule.operator_spaceship(DeploymentMM._applications(t),
    		CPSMM._applications(s).collect((e_2) ->
    			e_2 == null ?
    				null
    			:
    				this.ApplicationInstance2DeploymentApplication(
    					e_2
    				).t
    		)
    	);
    });
  
  public final TupleRule<CPS2DeploymentExplicitRuleCall.SourceTupleApplicationInstance2DeploymentApplication, CPS2DeploymentExplicitRuleCall.TargetTupleApplicationInstance2DeploymentApplication> ApplicationInstance2DeploymentApplication = 	new TupleRule<>(
    	SourceTupleApplicationInstance2DeploymentApplication.class,
    	TargetTupleApplicationInstance2DeploymentApplication.class,
    	(in, out) -> {
    		ApplicationInstance s = in.s;
    		DeploymentApplication t = out.t;
    	// src/fr/eseo/atol/examples/cps/atl/CPS2Deployment-explicitRuleCall.atl#36:4-36:22
    	TupleRule.operator_spaceship(DeploymentMM._id(t),
    		CPSMM._identifier(s)
    	);
    	// src/fr/eseo/atol/examples/cps/atl/CPS2Deployment-explicitRuleCall.atl#37:4-39:10
    	TupleRule.operator_spaceship(DeploymentMM._behavior(t),
    		CPSMM.behavior(CPSMM._type(s)).collect((e876435) ->
    			e876435 == null ?
    				null
    			:
    				this.ApplicationInstanceAndStateMachine2DeploymentBehavior(
    					s,
    					e876435
    				)
    		).collect((e876435) ->
    			e876435 == null ?
    				null
    			:
    				e876435.t
    		)
    	);
    });
  
  public final TupleRule<CPS2DeploymentExplicitRuleCall.SourceTupleApplicationInstanceAndStateMachine2DeploymentBehavior, CPS2DeploymentExplicitRuleCall.TargetTupleApplicationInstanceAndStateMachine2DeploymentBehavior> ApplicationInstanceAndStateMachine2DeploymentBehavior = 	new TupleRule<>(
    	SourceTupleApplicationInstanceAndStateMachine2DeploymentBehavior.class,
    	TargetTupleApplicationInstanceAndStateMachine2DeploymentBehavior.class,
    	(in, out) -> {
    		ApplicationInstance ai = in.ai;
    		StateMachine sm = in.sm;
    		DeploymentBehavior t = out.t;
    	// src/fr/eseo/atol/examples/cps/atl/CPS2Deployment-explicitRuleCall.atl#52:4-52:32
    	TupleRule.operator_spaceship(DeploymentMM._description(t),
    		CPSMM._identifier(sm)
    	);
    	// src/fr/eseo/atol/examples/cps/atl/CPS2Deployment-explicitRuleCall.atl#53:4-57:8
    	TupleRule.operator_spaceship(DeploymentMM._states(t),
    		CPSMM._states(sm).collect((e_3) ->
    			e_3 == null ?
    				null
    			:
    				this.ApplicationInstanceAndState2BehaviorState(
    					ai,
    					e_3
    				).t
    		)
    	);
    	// src/fr/eseo/atol/examples/cps/atl/CPS2Deployment-explicitRuleCall.atl#58:4-60:10
    	TupleRule.operator_spaceship(DeploymentMM._current(t),
    		CPSMM._initial(sm).collect((e876435) ->
    			e876435 == null ?
    				null
    			:
    				this.ApplicationInstanceAndState2BehaviorState(
    					ai,
    					e876435
    				)
    		).collect((e876435) ->
    			e876435 == null ?
    				null
    			:
    				e876435.t
    		)
    	);
    	// src/fr/eseo/atol/examples/cps/atl/CPS2Deployment-explicitRuleCall.atl#61:4-66:9
    	TupleRule.operator_spaceship(DeploymentMM._transitions(t),
    		validOutgoingTransitions(CPSMM._states(sm)).collect((e_4) ->
    			e_4 == null ?
    				null
    			:
    				this.ApplicationInstanceAndTransition2BehaviorTransition(
    					ai,
    					e_4
    				).t
    		)
    	);
    });
  
  public final TupleRule<CPS2DeploymentExplicitRuleCall.SourceTupleApplicationInstanceAndState2BehaviorState, CPS2DeploymentExplicitRuleCall.TargetTupleApplicationInstanceAndState2BehaviorState> ApplicationInstanceAndState2BehaviorState = 	new TupleRule<>(
    	SourceTupleApplicationInstanceAndState2BehaviorState.class,
    	TargetTupleApplicationInstanceAndState2BehaviorState.class,
    	(in, out) -> {
    		ApplicationInstance ai = in.ai;
    		State s = in.s;
    		BehaviorState t = out.t;
    	// src/fr/eseo/atol/examples/cps/atl/CPS2Deployment-explicitRuleCall.atl#76:4-76:31
    	TupleRule.operator_spaceship(DeploymentMM._description(t),
    		CPSMM._identifier(s)
    	);
    	// src/fr/eseo/atol/examples/cps/atl/CPS2Deployment-explicitRuleCall.atl#77:4-81:8
    	TupleRule.operator_spaceship(DeploymentMM._outgoing(t),
    		_validOutgoingTransitions(s).collect((e_5) ->
    			e_5 == null ?
    				null
    			:
    				this.ApplicationInstanceAndTransition2BehaviorTransition(
    					ai,
    					e_5
    				).t
    		)
    	);
    });
  
  public final TupleRule<CPS2DeploymentExplicitRuleCall.SourceTupleApplicationInstanceAndTransition2BehaviorTransition, CPS2DeploymentExplicitRuleCall.TargetTupleApplicationInstanceAndTransition2BehaviorTransition> ApplicationInstanceAndTransition2BehaviorTransition = 	new TupleRule<>(
    	SourceTupleApplicationInstanceAndTransition2BehaviorTransition.class,
    	TargetTupleApplicationInstanceAndTransition2BehaviorTransition.class,
    	(in, out) -> {
    		ApplicationInstance ai = in.ai;
    		Transition s = in.s;
    		BehaviorTransition t = out.t;
    	// src/fr/eseo/atol/examples/cps/atl/CPS2Deployment-explicitRuleCall.atl#102:4-102:31
    	TupleRule.operator_spaceship(DeploymentMM._description(t),
    		CPSMM._identifier(s)
    	);
    	// src/fr/eseo/atol/examples/cps/atl/CPS2Deployment-explicitRuleCall.atl#103:4-107:7
    	TupleRule.operator_spaceship(DeploymentMM._to(t),
    		CPSMM._targetState(s).collect((e_6) ->
    			e_6 == null ?
    				null
    			:
    				this.ApplicationInstanceAndState2BehaviorState(
    					ai,
    					e_6
    				).t
    		)
    	);
    	// src/fr/eseo/atol/examples/cps/atl/CPS2Deployment-explicitRuleCall.atl#108:4-121:49
    	TupleRule.operator_spaceship(DeploymentMM._trigger(t),
    		AbstractRule.let(
    			_sendParts(s),
    			(sendParts_7) ->
    				((IBox<BehaviorTransition>)(IBox<?>)AbstractRule.let(
    					selectBy(
    						CPSMM.applications(_candidateHostInstances(ai)),
    						key(sendParts_7),
    						((e_8) ->
    							_typeIdentifier(e_8)
    						)
    					),
    					(receiverAppInstances_9) ->
    						selectBy(
    							transitionsFromApplicationInstances(receiverAppInstances_9),
    							value(sendParts_7),
    							((e_10) ->
    								_waitParts(((Transition)e_10.reverse().get(0)))
    							)
    						).collect((e_11) ->
    							e_11 == null ?
    								null
    							:
    								this.ApplicationInstanceAndTransition2BehaviorTransition(
    									((ApplicationInstance)e_11.get(0)),
    									((Transition)e_11.reverse().get(0))
    								).t
    						)
    				))
    		)
    	);
    });
  
  private Map<State, IBox<Transition>> _validOutgoingTransitionsCache = new HashMap<>();
  
  public IBox<Transition> _validOutgoingTransitions(final State self_) {
    IBox<Transition> ret = _validOutgoingTransitionsCache.get(self_);
    if(ret == null) {
    	ret = CPSMM._outgoingTransitions(self_).selectMutable((e_12) ->
    		e_12 == null ?
    			AbstractRule.FALSE
    		:
    			CPSMM._targetState(e_12).collect((e876435) ->
    				e876435 == null
    			).collect((e876435) ->
    				(e876435 == null) ?
    					false
    				:
    					!e876435
    			).asOne(false)
    	);
    	_validOutgoingTransitionsCache.put(self_, ret);
    }
    return ret;
  }
  
  public IBox<Transition> validOutgoingTransitions(final IBox<? extends State> b) {
    return b.collectMutable(validOutgoingTransitionsLambda);
  }
  
  private IUnaryFunction<State, IBox<Transition>> validOutgoingTransitionsLambda = (e876435) ->
    	(e876435 == null) ?
    		AbstractRule.emptySequence()
    	:
    		_validOutgoingTransitions(e876435);
  
  private Map<ApplicationInstance, IBox<HostInstance>> _candidateHostInstancesCache = new HashMap<>();
  
  public IBox<HostInstance> _candidateHostInstances(final ApplicationInstance self_) {
    IBox<HostInstance> ret = _candidateHostInstancesCache.get(self_);
    if(ret == null) {
    	ret = AbstractRule.let(
    		CPSMM._allocatedTo(self_),
    		(hi_13) ->
    			CPSMM.communicateWith(hi_13).concat(
    				hi_13
    			)
    	);
    	_candidateHostInstancesCache.put(self_, ret);
    }
    return ret;
  }
  
  public IBox<HostInstance> candidateHostInstances(final IBox<? extends ApplicationInstance> b) {
    return b.collectMutable(candidateHostInstancesLambda);
  }
  
  private IUnaryFunction<ApplicationInstance, IBox<HostInstance>> candidateHostInstancesLambda = (e876435) ->
    	(e876435 == null) ?
    		AbstractRule.emptySequence()
    	:
    		_candidateHostInstances(e876435);
  
  private Map<ApplicationInstance, IBox<ImmutableList<Identifiable>>> _transitionsFromApplicationInstancesCache = new HashMap<>();
  
  public IBox<ImmutableList<Identifiable>> _transitionsFromApplicationInstances(final ApplicationInstance self_) {
    IBox<ImmutableList<Identifiable>> ret = _transitionsFromApplicationInstancesCache.get(self_);
    if(ret == null) {
    	ret = validOutgoingTransitions(CPSMM.states(CPSMM.behavior(CPSMM._type(self_)))).collect((e_14) ->
    		e_14 == null ?
    			null
    		:
    			ImmutableList.of(
    				self_,
    				e_14
    			)
    	);
    	_transitionsFromApplicationInstancesCache.put(self_, ret);
    }
    return ret;
  }
  
  public IBox<ImmutableList<Identifiable>> transitionsFromApplicationInstances(final IBox<? extends ApplicationInstance> b) {
    return b.collectMutable(transitionsFromApplicationInstancesLambda);
  }
  
  private IUnaryFunction<ApplicationInstance, IBox<ImmutableList<Identifiable>>> transitionsFromApplicationInstancesLambda = (e876435) ->
    	(e876435 == null) ?
    		AbstractRule.emptySequence()
    	:
    		_transitionsFromApplicationInstances(e876435);
  
  private Map<ApplicationInstance, IBox<String>> _typeIdentifierCache = new HashMap<>();
  
  public IBox<String> _typeIdentifier(final ApplicationInstance self_) {
    IBox<String> ret = _typeIdentifierCache.get(self_);
    if(ret == null) {
    	ret = CPSMM.identifier(CPSMM._type(self_));
    	_typeIdentifierCache.put(self_, ret);
    }
    return ret;
  }
  
  public IBox<String> typeIdentifier(final IBox<? extends ApplicationInstance> b) {
    return b.collectMutable(typeIdentifierLambda);
  }
  
  private IUnaryFunction<ApplicationInstance, IBox<String>> typeIdentifierLambda = (e876435) ->
    	(e876435 == null) ?
    		AbstractRule.emptySequence()
    	:
    		_typeIdentifier(e876435);
}
