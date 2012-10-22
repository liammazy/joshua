package joshua.decoder.ff.state_maintenance;

import java.util.List;

import joshua.decoder.chart_parser.SourcePath;
import joshua.decoder.ff.tm.Rule;
import joshua.decoder.hypergraph.HGNode;

public interface StateComputer<D extends DPState> {

  D computeState(Rule rule, List<HGNode> antNodes, int spanStart, int spanEnd, SourcePath srcPath);

  D computeFinalState(HGNode antNode, int spanStart, int spanEnd, SourcePath srcPath);

}
