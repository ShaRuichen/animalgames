package animalgames.command;

//比赛环境
public class Context
{
  private Race strategy;
  public Race getStrategy()
  {
      return strategy;
  }
  public void setStrategy(Race strategy)
  {
      this.strategy=strategy;
  }
  public int[] strategyMethod()
  {
      int[] m = strategy.strategyMethod();
      return m;
  }
}